package zzq.plugins.mmdb.mail;

/**
 * Wraps an Object and associates it with a text. All message parts (headers,
 * bodies, multiparts, body parts) will be wrapped in ObjectWrapper instances
 * before they are added to the JTree instance.
 * 
 * @Author zhangzuoqiang@live.cn
 * @Date 2012-11-6 ÏÂÎç3:27:15
 */
public class ObjectWrapper {

	private String text = "";
	private Object object = null;

	public ObjectWrapper(String text, Object object) {
		this.text = text;
		this.object = object;

		// System.out.println(CodecUtil.decodeEncodedWords(object.toString()));
	}

	public Object getObject() {
		return object;
	}

	@Override
	public String toString() {
		return text;
	}
}
