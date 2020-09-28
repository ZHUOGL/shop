package xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class JavaDocument {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(JavaDocument.class.getResourceAsStream("/goods.xml"));
        String xmlVersion = document.getXmlVersion();
        String xmlEncoding = document.getXmlEncoding();
        System.out.println("version:" + xmlVersion + "encoding:" + xmlEncoding);
        NodeList nodeList = document.getElementsByTagName("good");
        int goodElementSize = nodeList.getLength();
        for (int i = 0; i < goodElementSize; i++) {
            Node node = nodeList.item(i);
            String goodNodeName = node.getNodeName();
            System.out.println("第" + (i + 1) + "名称：");
            System.out.println("属性遍历");
            NamedNodeMap good = node.getAttributes();
            int len = good.getLength();
            for (int j = 0; j < len; j++) {
                Node att = good.item(j);
                System.out.println(att.getNodeName() + "=" + att.getNodeValue());
            }
            System.out.println();
            System.out.println();
            System.out.println("节点遍历:");
            NodeList goodNodeChild = node.getChildNodes();
            int size = goodNodeChild.getLength();
            for (int j = 0; j < size; j++) {
                Node goodNote = goodNodeChild.item(i);
                if (goodNote.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("标签节点:");
                    String nodeTagName = goodNote.getNodeName();
                    String node_innerHTML = goodNote.getTextContent();
                    System.out.println(" 标签名: " + nodeTagName + " , innerHTML: " + node_innerHTML);
                } else if (goodNote.getNodeType() == Node.TEXT_NODE) {
                    System.out.println("文本结点");
                }
                System.out.println();
            }
            System.out.println("***************************************");
        }
    }
}
