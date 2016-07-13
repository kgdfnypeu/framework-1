package com.fxtv.framework.model;

/**
 * 分享所需要的东西
 *
 * @author Android2
 */
public class ShareModel {
    public final static int SHARE_TYPE_QQ = 3;
    public final static int SHARE_TYPE_QQ_QZONE = 4;
    public final static int SHARE_TYPE_SINA = 5;
    public final static int SHARE_TYPE_WECHAT = 1;
    public final static int SHARE_TYPE_WECHAT_CIRCLE = 2;

    public String key;

    public int type;

    /**
     * 分享的标题
     */
    public String shareTitle;

    /**
     * 分享的地址
     */
    public String shareUrl;

    /**
     * 分享的缩略图地址
     */
    public String fileImageUrl;

    /**
     * 分享的缓存图片地址
     */
    public String cachePath;
    /**
     * 分享的摘要描述
     */
    public String shareSummary;
}
