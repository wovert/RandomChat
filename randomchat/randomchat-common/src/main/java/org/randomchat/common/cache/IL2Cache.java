package org.randomchat.common.cache;

import java.io.Serializable;

/**
 * @author Leo Yang
 * @date 2018年3月13日 下午7:47:28
 */
public interface IL2Cache {
	
	public void putL2Async(String key, Serializable value);
}
