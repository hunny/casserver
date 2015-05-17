package hh.hunnyhu.cas.authentication.handler;

import org.jasig.cas.authentication.handler.PasswordEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码的加密方式
 * @author hunnyhu
 */
public class HunnyHuPasswordEncoder implements PasswordEncoder {
	
    /** Log instance for logging events, errors, warnings, etc. */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

	public String encode(String password) {
		logger.debug("HunnyHuPasswordEncoder:" + password);
		return password;
	}

}
