package com.memberManage.controller;

import com.memberManage.entity.Member;
import com.memberManage.service.Impl.MemberServiceImpl;
import com.memberManage.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    MemberService memberService = new MemberServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //登录
        String loginname = request.getParameter("loginname");
        String pwd = request.getParameter("pwd");
        String s = "[A-Za-z0-9]{5,20}";
        boolean flag = Pattern.matches(s, loginname);
        System.out.println("flag=" + flag);
        if (flag == false) {
            request.setAttribute("message", "输入的账号格式错误！请检索");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        System.out.println(loginname);
        Member member = memberService.queryByLoginname(loginname);
        System.out.println(member);
        if (member == null) {
            request.setAttribute("message", "输入的账号不存在！请检索");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } else {
            if (pwd.equals(member.getPwd())) {
                if (member.getType() == 0)//管理员
                {
                    request.getRequestDispatcher("listUser.jsp").forward(request, response);
                } else if (member.getType() == 1) {
                    //用户
                }

            } else {
                request.setAttribute("message", "密码错误！请确认密码");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
        System.out.println(request.getAttribute("message"));
        //用户列表
        List<Member> members = memberService.queryAllMember();
        int count = members.size();
        System.out.println(count);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
