package tmall.util;
/**
 * 对象工厂
 * @author soft01
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

@SuppressWarnings("all")
public final class ObjectFactory {
	private static Map<String, Object> objectMap = new HashMap<String,Object>();
	static {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(ObjectFactory.class.getClassLoader().getResourceAsStream("bean.xml"));
			Element rootElement = document.getRootElement();
			List<Element> list = rootElement.elements("bean");
			for (Element element : list) {
				String key = element.attributeValue("id");
				String value = element.attributeValue("className");
				objectMap.put(key, Class.forName(value).newInstance());
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object getInstance(String key) {
		return objectMap.get(key);
	}
}
