package zzq.plugins.mmdb.mail;

import org.apache.james.mime4j.codec.DecodeMonitor;
import org.apache.james.mime4j.codec.DecoderUtil;

/**
 * 
 * @Author zhangzuoqiang@live.cn
 * @Date 2012-11-6 обнГ3:26:45
 */
public final class CodecUtil {

	/**
	 * Decode encoded words have the form =?charset?enc?encoded-text?= where enc
	 * is either 'Q' or 'q' for quoted-printable and 'B' or 'b' for base64.
	 * 
	 * @param body
	 * @return
	 */
	public static String decodeEncodedWords(String body) {
		return DecoderUtil.decodeEncodedWords(body, DecodeMonitor.SILENT);
	}
}
