package com.fq.common.constant;

import java.util.Properties;

import org.springframework.stereotype.Service;

import com.fq.util.ConfigUtil;

@Service
public class ClientConstant {
	
 	public final static String CFG_BASE_PATH = "/data/jnwtv/resource/client/" ;
 	
 	public final static String CARTOON_SHARE_BASE_PATH = "http://share.zrpic.com/jnwtv-web-share/toListLiveCartoonPage?lcId=" ;
// 	public final static String CARTOON_SHARE_BASE_PATH = "http://120.132.61.55/jnwtv-web-share/toListLiveCartoonPage?lcId=" ;
 	
 	
 	/**
 	 * 七牛资源空间名称
 	 */
 	public final static String BUCKETNAME = "jnwtv01" ;
	/**
	 * 注册
	 */
	public final static String KEY_REGISTER = "REGISTER" ;
	/**
	 * 重置密码
	 */
	public final static String KEY_RESETPWD = "RESETPWD" ;
	/**
	 * 领取活动
	 */
	public final static String KEY_ACTIVE = "ACTIVE" ;
	/**
	 * 绑定手机号
	 */
	public final static String KEY_BIND_MOBILE = "BIND_MOBILE" ;
	/**
	 * data
	 */
	public final static String KEY_DATA = "Data" ;
	/**
	 * data
	 */
	public final static String KEY_ACCOUNT = "account" ;
	
	public final static String IS_OPENED = "isOpened" ;
	/**
	 * 字符串空
	 */
	public final static String STRING_EMPTY = "" ;
	
	/**
	 * int空
	 */
	public final static int INT_ZERO = 0 ;
	/*
	 * 加血下限
	 */
	public final static int HEAL_LIMIT   ;
	/*
	 * 兑换异常上限次数
	 */
	public final static int EXECHANGE_ERROR_TIMES_LIMIT = 10 ;
	
	public final static Integer MOBILE_CODE_NUM_LIMIT  ;
	
	/**
	 * 启用redis
	 */
	public final static String DATASOURCE_FLAG_REDIS = "REDIS" ;
	
	/**
	 * 不启用redis
	 */
	public final static String DATASOURCE_FLAG_MYSQL = "MYSQL" ;
	
	/**
	 * 货币类型 据点
	 */
	public final static String COIN_TYPE_JPOINT  = "1" ;
	
	/**
	 * 货币类型 代金券
	 */
	public final static String COIN_TYPE_COUPON = "2" ;
	
	// 0:解锁消费 没有
	// 1:打赏个人消费 没有
	// 2:邀请奖励 没有 
	// 3:转发奖励 没有
	// 4:看完奖励 没有
	
	/**
	 * 每日登陆奖励
	 */
	public final static int LOGIN_REWARD_OP_TYPE = 5;
	
	public final static String WALLET_CHANNEL_TYPE_WX = "1" ; 
	public final static String WALLET_CHANNEL_TYPE_ZFB = "2" ;
	
	/**
	 * 充值获得
	 */
	public final static int EXECHANGE_OP_TYPE = 6 ;
	
	/**
	 * 影片打赏消费
	 */
	public final static int MOVIE_REWARD_OP_TYPE = 7 ;
	// 8 影片被打赏获得 没有
	// 9 个人被打赏获得 没有
	// 10 个人退款 客户端 没有
	/**
	 * 送礼
	 */
	public final static int SEND_GIFT_OP_TYPE = 11 ;
	
	/**
	 * 渠道下载奖励
	 */
	public final static int CHANNEL_DOWNLOAD_OP_TYPE = 12 ;
	
	/**
	 * 充值奖励
	 */
	public final static int EXECHANGE_REWARD_OP_TYPE = 13 ;
	/**
	 * 任务奖励
	 */
	public final static int TASK_REWARD_OP_TYPE = 14 ;
	/**
	 * 支付解锁影片消费
	 */
	public final static int PAY_TO_WATCH_OP_TYPE = 15 ;
	/**
	 * 支付解锁漫画
	 */
	public final static int PAY_TO_READ_OP_TYPE = 16 ;
	/**
	 * 支付解锁壁纸
	 */
	public final static int PAY_TO_WALLPAPER_OP_TYPE = 17 ;
	/**
	 * 解锁影片片段
	 */
	public final static int PAY_TO_MOVIE_NODE_OP_TYPE = 18 ;
	
	/**
	 * 邀请好友
	 */
	public final static int PAY_TO_INVITE_CODE_REWARD = 19 ;
	
	/**
	 *接受邀请
	 */
	public final static int PAY_TO_INVITE_CODE_INVITED_REWARD = 20 ;
	/*
	 * 间接邀请好友
	 */
	public final static int PAY_TO_INVITE_CODE_INDIRECT_INVITED_REWARD = 21 ;
	/*
	 * 购买选票消费
	 */
	public final static int PAY_TO_VOTE = 22 ;
	/*
	 * 钱包余额兑换
	 */
	public final static int WALLET_EXCHANGE = 23 ;
	/*
	 * 24:分享漫画
	 */
	public final static int TYPE_SHARE_LIVE_CARTOON = 24;
	/*
	 * 25:每日分享
	 */
	public final static int LOGIN_SHARE_DAILY = 25; 
	/*
	 * 26:解锁分享漫画
	 */
	public final static int TYPE_SHARE_LIVE_CARTOON_UNLOCK = 26 ;
	
	/*
	 * 27:赏金兑换
	 */
	public final static int TYPE_REWARD_EXCHANGE = 27 ;
	/*
	 * 28:小说章节解锁
	 */
	public final static int TYPE_NOVEL_CHAPTER_UNLOCK = 28 ;
	
	/*
	 * 29:影片分享
	 */
	public final static int MOVIE_SHARE_DAILY = 29; 
	public final static int SIGN_DAILY = 30; 
	/*
	 * 选票
	 */
	public final static String VOTE_TYPE_NORMAL = "1";  // 普通选票
	public final static String VOTE_TYPE_BIG = "2";  // 大选票
	public final static String VOTE_TYPE_SUPER = "3"; // 超级选票
	
	public final static String VOTE_FROM_CHAST = "1";  // 选票来源 -- 宝箱
	public final static String VOTE_FROM_BUY = "2";  // 选票来源 -- 购买
	
	public final static String VOTE_TYPE_ACTIVE = "1";  // 赠送对象--活动
	public final static String VOTE_TYPE_NOVEL = "2";  // 赠送对象--小说
	
	/**
	 * 对象空
	 */
	public final static Object OBJ_NULL = null ;
	/**
	 * 字符串等于“0”
	 */
	public final static String STRING_ZERO = "0" ;
	/**
	 * 字符串等于“1”
	 */
	public final static String STRING_ONE = "1" ;
	/**
	 * 字符串等于Android
	 */
	public final static String STRING_A = "A" ;
	
	/**
	 * 字符串等于Y
	 */
	public final static String STRING_Y = "Y" ;
	
	/**
	 * 字符串等于N
	 */
	public final static String STRING_N = "N" ;
	/**
	 * 字符串等于C
	 */
	public final static String STRING_C = "C" ;
	/**
	 * 字符串等于Ios
	 */
	public final static String STRING_I = "I" ;
	
	/**
	 * 字符串等于V
	 */
	public final static String STRING_V = "V" ;
	
	public final static String CHAR_PERIOD = "." ;
	public final static String STRING_BLANK = " " ;
	public final static String STRING_SLASH = " / " ;
	public final static String IOS_CLIENT_TYPE_IPBV = "IPBV" ;// 小说剧
	public final static String IOS_CLIENT_TYPE_IPCV = "IPCV" ; // 漫画剧
	public final static String IOS_CLIENT_TYPE_IPV = "IPV" ; // 元旦版
	public final static String VIP_TYPE_NORMAL = "1" ; // 会员类型：正常购买会员
	public final static String VIP_TYPE_FREE = "2" ; // 活动赠送会员
	
	/**
	 * 字符串等于cancle
	 */
	public final static String STRING_CANCLE = "CANCLE" ;
	/**
	 * 字符串等于Add
	 */
	public final static String STRING_ADD = "ADD" ;
	/*
	 * 中国
	 */
	public final static String STRING_CN = "中国" ;
	/*
	 * 台湾
	 */
	public final static String STRING_TW = "台湾" ;
	
	/**
	 * 对账的信息类型
	 * 1:个人打赏给个人  ,2 , 个人被打赏   3,个人打赏项目 ， 4，项目被打赏   5:每日登录奖励 , 6:注册 , 7:充值据点 ; 8:充值据点奖励
	 * 9：vip充值； 10:钱包兑换
	 */
	
	public final static String TRADE_USER_SEND_REWARD_TO_PROJECT_STATUS = "3";  //个人打赏项目
	
	public final static String TRADE_PROJECT_REWARD_STATUS = "4";   //项目被打赏
	
	public final static String TRADE_EVERYDAY_LOGIN_REWARD_STATUS = "5";  //每日登录奖励
	
	public final static String TRADE_REGISTER_REWARD_STATUS = "6";  //注册
	
	public final static String TRADE_RECHARGE_MONEY_STATUS = "7";   //充值据点
	
	public final static String TRADE_RECHARGE_MONEY_REWARD_STATUS = "8";   //充值据点奖励
	
	public final static String TRADE_RECHARGE_VIP = "9";   // vip充值 
	public final static String TRADE_WALLET_EXCHANGE = "10";   // 余额兑换 
	public final static String TRADE_WALLET_RED_PACKET = "11";   // 拆红包
	public final static String TRADE_WALLET_WITHDRAW = "12";   // 余额提现 
	public final static String TRADE_REWARD_EXCHANGE = "13";   // 赏金兑换
	public final static String TRADE_REWARD_WITHDRAW = "14";   // 赏金提现
	
	/**
	 * 对账信息实体类型
	 */
	public final static String TRADE_PROJECT_STATUS = "2";  //项目
	public final static String TRADE_PERSONAL_STATUS = "1";  //个人
	
	
	/**
	 * 时间格式 ： 年月日时分秒
	 * yyyy-MM-dd HH:mm:ss
	 */
	public final static String date_DatetimeStr = "yyyy-MM-dd HH:mm:ss"; 
	
	/**
	 * 时间格式 ： 年月日时分秒
	 * yyyyMMddHH:mm:ss
	 */
	public final static String date_DatetimeStr2 = "yyyyMMddHHmmss"; 
	
	/**
	 * 时间格式 ： 年月 
	 * yyyy-MM
	 */
	public final static String date_YearMonth = "yyyy-MM"; 
	
	/**
	 * 时间格式 ： 年月日 
	 * yyyy-MM-dd
	 */
	public final static String date_DateStr1 = "yyyy-MM-dd"; 
	
	/**
	 * 时间格式 ： 年月日 
	 * yyyyMMdd
	 */
	public final static String date_DateStr2 = "yyyyMMdd"; 
	
	/**
	 * 时间格式 ： 时分秒
	 * HH:mm:ss
	 */
	public final static String date_TimeStr = "HH:mm:ss";
	
	/*
	 * 项目排序action
	 */
	public final static String ACTION_USER_LOGIN = "USER_LOGIN"; // 用户登录
	
	public final static String ACTION_COMMENT_PROJECT = "COMMENT_PROJECT"; // 项目评论
	
	public final static String ACTION_COMMENT_REPLY_PROJECT = "COMMENT_REPLY_PROJECT"; // 项目评论回复
	
	public final static String ACTION_COMMENT_PRAISE = "COMMENT_PRAISE"; // 评论点赞
	
	public final static String ACTION_COMMENT_COLLECTION = "COMMENT_COLLECTION"; // 评论收藏
	
	public final static String ACTION_HEAL = "HEAL"; // 项目加血
	
	public final static String ACTION_SEND_REWARD = "SEND_REWARD"; // 项目加血
	
	public final static String ACTION_SHARE = "SHARE"; // 项目分享
	
	public final static String ACTION_MOVIE_PLAY = "MOVIE_PLAY"; // 项目分享
	
	public final static String ACTION_UPLOAD_PROJECT = "UPLOAD_PROJECT"; // 上传项目
	
	public final static String ACTION_UPLOAD_LOG = "UPLOAD_LOG"; // 上传日志
	
	public final static String ACTION_COMMENT_LOG  = "COMMENT_LOG "; // 评论日志
	
	public final static String ACTION_COMMENT_LOG_REPLY  = "COMMENT_LOG_REPLY "; // 回复日志
	
	public final static String ACTION_PRAISE_PROJECT = "PRAISE_PROJECT"; // 项目点赞
	
	public final static String ACTION_SEND_BULLETSCREEN = "SEND_BULLETSCREEN"; // 影片发送弹幕
	
	public final static String ACTION_SEND_GIFT_2_USER = "SEND_GIFT_2_USER";// 送礼物给给人
	
	public final static String ACTION_SEND_GIFT_2_CREW = "SEND_GIFT_2_CREW";// 送礼物给给剧组
	
	public final static String ACTION_UNLOCK_WALLPAPER = "UNLOCK_WALLPAPER";// 解锁壁纸
	
	public final static String ACTION_UNLOCK_LIVECARTOON = "UNLOCK_LIVECARTOON";// 解锁漫画
	
	public final static String ACTION_UNLOCK_MOVIE_NODE = "UNLOCK_MOVIE_NODE";// 解锁漫画
	
	public final static String ACTION_VIP_RECHARGE = "VIP_RECHARGE";// 会员充值
	public final static String ACTION_TASK_REWARD = "TASK_REWARD";// 任务奖励
	/*
	 * 剧圈送礼
	 */
	public static final String  GIFT_MSG_LOG_FIRST= "送了" ;
	public static final String  GIFT_MSG_LOG_SECOND= "一个" ;
	public static final String  REPLY_MSG_LOG_FIRST= "收到了" ;
	public static final String  REPLY_MSG_LOG_SECOND= "的语音回复" ;
	public static final String  VOTE_MSG_LOG_FIRST= "投了" ;
	public static final String  VOTE_MSG_LOG_SECOND= "一张" ;
	
	
	
	public final static String USER_HE = "他"; // 男人
	
	public final static String USER_SHE = "她"; // 女人
	
	public static final String USER_ROLE_TYPE_ACTOR = "2"; // 演员
	
	public static final String USER_ROLE_SUB_TYPE_DUBBING = "2"; // 配音演员
	
	/*
	 * 用户个人中心头像
	 * 210
	 */
	public final static Integer USER_PERSONAL_HEAD  ; 
	
	public final static Integer IMG_WIDTH_SMALL  ;
	
	public final static Integer IMG_WIDTH_MIDDLE  ;
	
	public final static Integer IMG_WIDTH_FOT_PHOTO ;
	
	public final static Integer IMG_WIDTH_FOR_NOVEL_TYPE ;
	public final static Integer IMG_HEIGHT_FOR_NOVEL_TYPE ;
	public final static Integer IMG_WIDTH_FOR_NOVEL_COVER ; // 列表页宽度
	public final static Integer IMG_HEIGHT_FOR_NOVEL_COVER ; // 列表页高度
	public final static Integer IMG_WIDTH_FOR_NOVEL_DETAIL_COVER ; // 详情页 宽度
	public final static Integer IMG_HEIGHT_FOR_NOVEL_DETAIL_COVER ; // 详情页高度
	
	public final static Integer HEAD_WIDTH   ;
	
	public final static Integer HOMEPAGE_COVERURL_HEIGHT ;
	
	public final static Integer HOMEPAGE_COVERURL_WIDTH ;
	
	public final static Integer USER_SPACE_MOVIE_COVER_HEIGHT ;
	
	public final static Integer USER_SPACE_MOVIE_COVER_WIDTH ;
	
	public final static Integer INVITE_CODE_REWARD = 100 ; //邀请好友奖励
	
	public final static Integer INVITE_CODE_INVITED_REWARD = 50 ; // 接受好友邀请奖励
	
	public final static Integer INVITE_CODE_INDIRECT_INVITED_REWARD = 20 ; // 间接邀请好友奖励
	
	public final static Integer BANNER_COVERURL_HEIGHT=171 ;
	
	public final static Integer BANNER_COVERURL_WIDTH=576;
	
	/*
	 * 日志
	 */
	public final static Integer LOG_IMG_SINGLE ;// 日志单图尺寸 540 
	
	public final static Integer LOG_IMG_MULTIP ;// 日志多图尺寸 260
	
	public final static Integer LOG_VIDEO_COVER_WIDTH ;// 日志视频封面截图宽度
	
	public final static Integer LOG_VIDEO_COVER_HEIGHT ;// 日志视频封面截图高度
	
	public final static Integer LOG_COMMENT_IMG = 260 ;//日志评论配图尺寸  520
	
	public final static Integer ACTIVITY_LIST_URL_HEIGHT ;// 活动列表页图片高度280
	
	public final static Integer ACTIVITY_LIST_URL_WIDTH ;// 活动列表页图片宽度660
	
	public final static Integer ACTIVITY_DETAIL_URL_WIDTH ;// 活动详情页图片宽度280
	
	public final static Integer ACTIVITY_DETAIL_URL_HEIGHT ;// 活动详情页图片高度720
	
	public final static Integer ACTIVITY_BOOK_LIST_URL_HEIGHT   ;// 活动列表页书本图片高度160
	
	public final static Integer ACTIVITY_BOOK_LIST_URL_WIDTH  ;// 活动列表页书本图片高度120

	public final static Integer ACTIVITY_BOOK_URL_HEIGHT  ;// 书本详情图片高度160
	
	public final static Integer ACTIVITY_BOOK_URL_WIDTH  ;// 书本详情图片宽度120
	
	/**
	 * 礼物类型
	 */
	public final static String  GIVE_GIFT_TYPE_VOTE ="10" ; // 赠送选票
	
	/*
	 * 礼物
	 */
	public final static Integer  GIFT_IMG_WIDTH ; // 礼物原图大小126
	
	public final static Integer  GIFT_IMG_THUMB_WIDTH ; // 礼物缩略图大小20
	
	public final static Integer  GIFT_LOG_IMG_WIDTH ; // 礼物原图大小70
	
	public final static Integer  GIFT_LOG_IMG_THUMB_WIDTH ; // 礼物缩略图大小36
	
	public final static Integer  USER_PHOTO_IMG_THUMB_WIDTH ; // 个人中心相册图片缩略图宽48
	
	public final static Integer  USER_PHOTO_IMG_THUMB_HEIGHT ; // 个人中心相册缩略图高48

	public final static Integer  USER_HEAD_IMG_THUMB_HEIGHT ; // 个人个人中心头像尺寸128
	public final static Integer  USER_HEAD_IMG_THUMB_WIDTH ; // 个人个人中心头像尺寸128
	
	public final static Integer  PROJECT_LIVE_CARTOON_COVER_WIDTH   ; // 漫画封面图宽
	public final static Integer  PROJECT_LIVE_CARTOON_COVER_HEIGHT ; // 漫画封面图高
	
	public final static Integer  PROJECT_WALLPAPER_WIDTH = 230 ; // 项目壁纸宽度
	public final static Integer  PROJECT_WALLPAPER_HEIGHT = 410 ; // 项目壁纸高度
	
	public final static Integer  PROJECT_LIVE_CARTOON_INTERVAL_SIZE  ; // 漫画封面图高
	public final static Integer  LIVE_CARTOON_CHAPTER_COVER_WIDTH  ; // 漫画封面图高
	public final static Integer  LIVE_CARTOON_CHAPTER_COVER_HEIGHT ; // 漫画封面图高
	
	public final static String  LIVE_CARTOON_TO_WATCH_MOVIE = "前往图片剧"; // 前往图片剧
	public final static String  LIVE_CARTOON_TO_HEAL_MOVIE = "给图片剧凑份子"; // 给图片剧凑份子
	
	public final static Integer  HOT_FAN_IMG_THUMB_WIDTH ; // 列表页宽度
	public final static Integer  HOT_FAN_IMG_THUMB_HEIGHT ; // 列表页高度
	public final static Integer  FAN_COVER_IMG_WIDTH =500 ; // 同人作品封面高度
	public final static Integer  FAN_COVER_IMG_HRIGHT = 500 ; // 同人作品封面宽度
	
	public final static Integer  FAN_ITEM_IMG_WIDTH =1280 ; // 同人作品条目图片高度
	public final static Integer  FAN_ITEM_IMG_HEIGHT = 1280 ; // 同人作品条目图片宽度
	
	public final static Integer  FAN_ROLE_IMG_WIDTH =200 ; // 同人作品角色高度
	public final static Integer  FAN_ROLE_IMG_HEIGHT= 200 ; // 同人作品角色宽度
	
	public final static Integer  FAN_MODEL_COVER_IMG_WIDTH =200 ; // 同人作品模板封面高度
	public final static Integer  FAN_MODEL_COVER_IMG_HEIGHT= 200 ; // 同人作品模板封面宽度
	
	public final static Integer  FAN_LIST_COVER_IMG_WIDTH =500 ; // 同人作品列表页封面高度
	public final static Integer  FAN_LIST_COVER_IMG_HEIGHT= 500 ; // 同人作品列表页封面宽度
	
	/*
	 * 分页
	 */
	public final static String ORDER_DESC = "desc" ;
	
	public final static String ORDER_ASC = "asc" ;
	
	public final static Integer COMMON_PAGE_SIZE ;// 普通分页pageSize 10 
	
	public final static Integer FAN_MODEL_PAGE_SIZE = 100 ;// 普通分页pageSize 100 
	
	public final static Integer COMMON_PAGE_SIZE_20 = 20 ;// 普通分页pageSize 10 
	
	public final static Integer USER_PHOTO_PAGE_SIZE ; //用户相册分页pagesize15
	
	public final static Integer PAPA_PAGE_SIZE ;//爸爸列表pageSize 15
	
	public final static Integer COMMENT_PAGE_SIZE ;//评论列表pageSize 10
	
	public final static Integer LOG_PAGE_SIZE ;//日志列表pageSize 10 
	
	public final static Integer LOG_PRAISE_NUM   ;//日志点赞人列表pageSize 10 
	
	public final static Integer REPLY_PAGE_SIZE ;//回复列表pageSize 10 

	public final static Integer COMMENT_REPLY_PAGE_SIZE ;// 评论回复列表pageSize 3 
	
	public final static Integer HOT_COMMENT_LIMIT   ;// 热门评论限制上限 
	
	public final static Integer PROJECT_WALLPAPER_SIZE = 12 ;// 普通分页pageSize 10 
	
	public final static Integer FIND_LIVECARTOON_SIZE = 6 ;// 发现页漫画分页数量
	
	public final static Integer USER_CHEST_WIDTH = 148 ;// 用户背包图片宽度
	
	public final static Integer NOVEL_RANK_SIZE = 3 ; //小说榜单排行分页数
	public final static Integer NOVEL_CATALOG_PAGE_SIZE = 100 ; //小说目录分页size
	public final static Integer NOVEL_RELATED_PAGE_SIZE = 6;// 小说猜你喜欢页大小
	
	public final static Integer PAGE_SIZE_18 = 18;// 分页大小
	
	public final static Integer FAN_PAGE_SIZE_15 = 15;// 同人作品分页大小
	
	/*
	 * 用户送的据点
	 */
	public final static Integer USER_JPOINT_FOR_INIT_LOGIN; // 登录奖励 10 
	
	public final static Integer USER_JPOINT_FOR_INIT_LOGIN_MAX ; //用户每日登陆最大值
	
	public final static Integer USER_JPOINT_FOR_INIT_LOGIN_MIN ; //用户每日登陆最小值
	
	public final static Integer USER_COUPON_FOR_SHAR_LIVE_CARTOON_MAX  ; //用户分享漫画奖励最大值
	
	public final static Integer USER_COUPON_FOR_SHAR_LIVE_CARTOON_MIN  ; //用户分享漫画奖励最小值
	/*
	 * 0:解锁消费
	 */
	public final static String JPOINT_LOG_UNLOCK_CONSUME = "解锁消费" ; 
	/*
	 * 2:邀请奖励 
	 */
	public final static String JPOINT_LOG_INVITATION = "邀请奖励" ;  
	/*
	 * 3:转发奖励 
	 */
	public final static String JPOINT_LOG_FORWARD = "转发奖励" ; 
	/*
	 * 4:看完奖励
	 */
	public final static String JPOINT_LOG_WATCH_MOVIE = "看完奖励 " ;  
	/*
	 *5: 登录奖励
	 */
	public final static String JPOINT_LOG_LOGIN = "登录奖励" ; //5:
	
	/*
	 *注册奖励奖励
	 */
	public final static String JPOINT_LOG_REGISTER = "注册奖励" ; 
	/*
	 *  6：充值获得 
	 */
	public final static String JPOINT_LOG_PAY = "充值获得 " ; // 6
	/*
	 * 7:打赏影片消费
	 */
	public final static String JPOINT_LOG_REWARD_MOVIE_CONSUME = "打赏影片消费" ;  
	/*
	 * 8:影片被打赏获得
	 */
//	public final static String JPOINT_LOG_MOVIE_BE_REWARD = "影片被打赏获得" ;  
	/*
	 * 9:个人被打赏获得
	 */
//	public final static String JPOINT_LOG_PERSON_BE_REWARD = "个人被打赏获得" ;  
	/*
	 * 10:个人退款
	 */
	public final static String JPOINT_LOG_REFUND = "个人退款" ; 
	/*
	 * 11:送礼消费
	 */
	public final static String JPOINT_LOG_SEND_GIFT_CONSUME = "送礼消费" ;  
	/*
	 * 12：下载奖励
	 */
	public final static String JPOINT_LOG_DOWNLOAD = "下载奖励" ;  
	/*
	 * 13：充值奖励
	 */
	public final static String JPOINT_LOG_PAY_REWARD = "充值奖励" ; 
	/*
	 * 14:完成任务奖励
	 */
	public final static String JPOINT_LOG_TASK_REWARD = "完成任务奖励" ; 
	/*
	 *15:解锁影片消费
	 */
	public final static String JPOINT_LOG_PAY_TO_WATCH_CONSUME = "解锁影片消费" ; 
	/*
	 * 16:解锁漫画消费
	 */
	public final static String JPOINT_LOG_PAY_TO_READ_CARTOON_CONSUME = "解锁漫画消费" ; 
	/*
	 * 17:解锁壁纸消费
	 */
	public final static String JPOINT_LOG_PAY_TO_WALLPAPER_CONSUME = "解锁壁纸消费" ; 
	/*
	 * 18:解锁影片片段消费
	 */
	public final static String JPOINT_LOG_PAY_TO_MOVIE_NODE_CONSUME = "解锁影片片段消费" ; 
	public final static String JPOINT_INVITE_CODE_REWARD = "邀请好友" ; 
	public final static String JPOINT_LOG_INVITE_CODE_INVITED_REWARD = "接受邀请" ; 
	/*
	 * 21 间接邀请好友
	 */
	public final static String JPOINT_LOG_INVITE_CODE_INDIRECT_INVITED_REWARD = "间接邀请好友" ; 
	/*
	 * 22.PAY_TO_VOTE 购买选票消费
	 */
	public final static String JPOINT_LOG_PAY_TO_VOTE_CONSUME = "购买选票消费" ; 
	/*
	 * 23.剧点
	 */
	public final static String JPOINT_LOG_WALLET_EXCHANGE = "钱包余额兑换" ; 
	/*
	 * 24:分享漫画
	 */
	public final static String JPOINT_LOG_SHARE_LIVE_CARTOON = "分享漫画" ;
	public final static String JPOINT_LOGIN_SHARE_DAILY = "每日分享" ; // 25s
	public final static String JPOINT_LOG_SHARE_LIVE_CARTOON_UNLOCK = "漫画解锁分享" ; //26
	public final static String JPOINT_LOG_TYPE_REWARD_EXCHANGE = "魅力值兑换" ; // 27
	public final static String JPOINT_LOG_TYPE_NOVEL_CHAPTER_UNLOCK = "小说章节解锁" ;//28
	public final static String JPOINT_LOG_MOVIE_SHARE_DAILY = "影片分享奖励" ; //29:
	public final static String JPOINT_LOG_SIGN_DAILY = "每日签到奖励" ; //30:
	/*
	 * 图片
	 */
	public final static String PROJECT_LOG_COMMENT_DEFAULT_MSG = "【该回复旧版本无查看权限，请更新版本哟~】" ;
	public final static String PROJECT_LOG_COMMENT_NOTIFY_MSG = "回复了您:" ;
	public final static String IMG_CONTENT = "【图片】" ;
	public final static String GIFT_CONTENT = "【礼物】" ;
	public final static String VOTE_CONTENT = "【选票】" ;
	
	/*
	 * level
	 */
	public final static Integer HEAL_EXE_LIMIT = 10000  ;// 加血获取经验上限
	
	public final static Integer REPLY_LOG_EXE_LIMIT = 10   ;// 日志回复一天上限
	
	public final static Integer COMMENT_EXE_LIMIT = 10   ;// 评论一天上限
	
	public final static Integer PLAY_EXE_LIMIT = 10   ;// 播放一天上限
	
	public final static Integer LOGIN_EXE_LIMIT = 2   ;// 评论一天上限
	
	public final static Integer SHARE_EXE_LIMIT = 50   ;// 经验值50
	
	public final static Integer EXE_LIMIT_PUBLISH_PROJECT_LOG = 20   ;// 发表日志经验值上限20
	
	public final static Integer EXE_AMOUNT_ONE = 1   ;// 经验值1
	public final static Integer EXE_AMOUNT_SEND_PROJECT_LOG = 2   ;// 发日志经验值2
	public final static Integer EXE_AMOUNT_SEND_PROJECT_LOG_REPLY = 2   ;// 发日志回复经验值2
	public final static Integer EXE_AMOUNT_SEND_PROJECT_LOG_REPLY_LIMIT = 20   ;// 发日志回复经验值上限20
	public final static Integer EXE_AMOUNT_SHARE = 2   ;// 分享经验2
	public final static Integer EXE_AMOUNT_SHARE_LIMIT = 100   ;// 发日志回复经验值上限20
	public final static Integer EXE_AMOUNT_NOVEL_COMMENT = 2   ;// 分享经验2
	public final static Integer EXE_AMOUNT_NOVEL_COMMENT_LIMIT = 10   ;// 小说评论限制10
	public final static Integer EXE_AMOUNT_PROJECT_COMMENT_AND_REPLY = 2   ;// 项目评论2
	public final static Integer EXE_AMOUNT_PROJECT_COMMENT_AND_REPLY_LIMIT = 10   ;// 项目评论上限10
	
	public final static Integer EXE_AMOUNT_FIVE = 5   ;// 经验值5
	
	public final static Integer EXE_AMOUNT_VIP = 10 ;// 会员充值经验增加百分比
	
	/*
	 * 剧点 用户注册
	 */
	public final static Integer JPOINT_USER_REGISTER  ;
	
	/*
	 * 通知提示类型
	 */
	public final static String NOTIFY_PROJECT_LOG_REPLY= "1"  ;// 日志评论的回复
	
	public final static String NOTIFY_PROJECT_COMMENT_REPLY= "2"  ;// 评论的回复 
	public final static String NOTIFY_PROJECT_COMMENT_REPLY_REPLY= "3"  ;// 评论回复的回复
	public final static String NOTIFY_SYSTEM_MSG= "4"  ;// 系统消息 
	public final static String NOTIFY_CHASING = "5"  ;// 追剧消息
	
	public final static String NOTIFY_GIFT_THANKS_VOICE_MSG = "7"  ;// 收礼语音回复
	public final static String NOTIFY_GIFT_OPENED = "8"  ;// 拆礼物消息
	public static final String  REWARD_TYPE_GIFT = "3" ;
	public static final String  REWARD_TYPE_VOTE = "4" ;// 选票获得赏金
	public static final String  NOTIFY_TYPE_LOG_REPLY = "10" ;// 选票获得赏金
	public static final String  NOTIFY_TYPE_FAN_CHAPTER_COMMENT_REPLY = "19" ;// 同人作品章节评论回复通知；
	public static final String  NOTIFY_TYPE_FAN_CHAPTER_COMMENT = "17" ;// 同人作品章节被评论通知消息
	public static final String  NOTIFY_TYPE_FAN_ITEM_COMMENT = "18" ;//  同人作品条目被评论通知消息
	
	
	public static final String  CLIENT_VERSION_NO_ANDROID = "2.16.0" ;// android 好友点赞通知
	public static final String  CLIENT_VERSION_NO_IOS = "3.5.3" ;// ios 好有点赞通知
	
	public static final String  CLIENT_VERSION_NO_ANDROID_LOG_COMMENT = "2.22.0" ;// android 好友点赞通知
	public static final String  CLIENT_VERSION_NO_IOS_LOG_COMMENT = "3.8.0" ;// ios 好有点赞通知
	
	
	/**
	 * 苹果审核版本号
	 */
	public final static String AUDIT_VERSION ;
	
	/**
	 * 苹果内购
	 */
	public final static String AUDIT_URL_FOR_RECHARGE ;  //苹果内购测试地址
	
	public final static String ONLINE_URL_FOR_RECHARGE ;  //苹果内购线上地址
	
	/**
	 * 给钱提前看类型
	 */
	public final static String PLAY_PERMISION_TYPE_CROWDFUNDING = "1" ;// 众筹获取的资格
	
	public final static String PLAY_PERMISION_TYPE_PAY_TO_WATCH = "2" ;// 支付获取的资格
	/*
	 * 任务
	 */
	/**
	 * 不可领奖
	 */
	public final static String TASK_RECEIVE_UNFINISHED = "1" ; 
	/**
	 * 已领奖
	 */
	public final static String TASK_RECEIVE_CLAIMED = "2" ;  
	/**
	 * 可领奖
	 */
	public final static String TASK_RECEIVE_UNCLAIMED = "3" ; 
	
	/*
	 * 首充奖励tiId
	 */
	public static final Integer TASK_ID_ACHIEVEMENT_FIRST_PAY = 19 ;
	public static final Integer TASK_ID_ACHIEVEMENT_QUESTION_FINISHED = 27 ;
	public static final Integer TASK_ID_ACHIEVEMENT_FIRST_CHAT_REWARD = 28 ;
	/*
	 * taskType
	 */
	public static final String TASK_TYPE_NEWER = "1" ;// 新手任务
	public static final String TASK_TYPE_DAILY = "2" ;// 每日任务
	public static final String TASK_TYPE_ACTIVITY = "3" ;// 活动任务
	public static final String TASK_TYPE_INVITIED = "4" ;// 邀请好友任务
	/*
	 * taskSubType
	 */
	public static final Integer TASK_SUB_TYPE_BIND_MOBILE = 1 ;// 绑定手机
	public static final Integer TASK_SUB_TYPE_FIRST_PAY = 2 ;// 首充奖励
	public static final Integer TASK_SUB_TYPE_ATTENTION_JNWTV = 3 ;// 关注剧能玩
	public static final Integer TASK_SUB_TYPE_SUPPORT_JNWTV = 4 ;// 支持剧能玩
	public static final Integer TASK_SUB_TYPE_INVITED_FRIEND = 5 ;// 邀请好友
	public static final Integer TASK_SUB_TYPE_SHAR_CARTOON = 6 ;// 分享漫画
	public static final Integer TASK_SUB_TYPE_DAILY_SHARE = 7 ;// 每日分享
	/*
	 * taskReward
	 */
	public static final Integer TASK_REWARD_INVITE_FRIEND  ; // 邀请好友单人奖励
	public static final Integer TASK_REWARD_INVITE_FRIEND_7  ; // 邀请好友7人奖励
	public static final Integer TASK_REWARD_INVITE_NUM  ; // 邀请好友额外奖励人数 ~ 7
	public static final Integer TASK_REWARD_INVITED  ; // 接受好友邀请奖励
	
	public static final String PAY_PINGPP_TRADE_TYPE_PAY = "1" ; // 支付
	public static final String PAY_PINGPP_TRADE_TYPE_REWARD = "2" ; // 奖励
	public static final String PAY_PINGPP_TRADE_TYPE_VIP_RECHARGE = "3" ; // 会员充值
	public static final String PAY_PINGPP_TRADE_TYPE_WITHDRAW_APP = "4" ; // 提现申请
	
	public static final String TP_TRADE_CHANNEL_IOS = "1" ; // 订单渠道：1：ios内购
	public static final String TP_TRADE_CHANNEL_PINGPP = "2" ; // 订单渠道：2:ping++
	public static final String TP_TRADE_CHANNEL_CDKEY = "3" ; // 订单渠道：3:CDKEY兑换
	public static final String TP_TRADE_CHANNEL_ALIPAY = "4" ; // 订单渠道：4:ALIPAY手机支付
	public static final String TP_TRADE_CHANNEL_UPACP = "5" ; // 订单渠道：5：银联支付
	public static final String TP_TRADE_CHANNEL_WX = "6" ; // 订单渠道：6:微信支付
	public static final String TP_TRADE_CHANNEL_WALLET_PAY = "7" ; // 订单渠道：7：余额支付
	public static final String TP_TRADE_CHANNEL_WALLET_RED_PACKEY = "8" ; // 订单渠道：8：红包获得
	public static final String TP_TRADE_CHANNEL_WALLET_WITHDRAW = "9" ; // 订单渠道9：余额提现
	public static final String TP_TRADE_CHANNEL_REWARD_EXCHANGE = "10" ; // 订单渠道10：赏金兑换
	public static final String TP_TRADE_CHANNEL_REWARD_WITHDRAW = "11" ; // 订单渠道11：赏金提现
	/**
	 * 日志类型
	 */
	public final static String LOGTYPE_LOG="1" ; // 剧圈
	public final static String LOGTYPE_CHAT="2" ; // 水区
	public final static String LOGTYPE_RESOURCES="3" ; // 资源区
	
	public final static String LOG_SUB_TYPE_NORMAL="1";// 普通帖
	public final static String LOG_SUB_TYPE_XP="2"; // 选票帖
	public final static String LOG_SUB_TYPE_LP="3"; // 拉票帖
	public final static String LOG_SUB_TYPE_FAN="4"; // 分享同人
	public final static String LOG_SUB_TYPE_USER_SHARE="5"; // 分享用户
	public final static String LOG_SUB_TYPE_CARTOON_SHARE="6"; // 分享漫画
	public final static String LOG_SUB_TYPE_CARTOON_CHAPTER_SHARE="7"; // 分享漫画章节
	public final static String LOG_COMMENT_BUSI_TYPE_GIFT="1";// 礼物
	public final static String LOG_COMMENT_BUSI_TYPE_VOTE="2";// 选票
	
	public final static String LOG_PERMISSION_TYPE_FREE="1";// 免费
	public final static String LOG_PERMISSION_TYPE_LEVEL="2"; // 等级下限
	public final static String LOG_PERMISSION_TYPE_VIP="3"; // 会员可看
	
	public final static String LOG_DELETED_NOTIFY_MSG_START="您于"; // 你的帖子已被删除，原因：XXXX
	public final static String LOG_DELETED_NOTIFY_MSG_END="发的帖子已被删除，原因："; // 你的帖子已被删除，原因：XXXX
	
	
	
	// 快捷支付
	public static final Integer PRODUCT_EASY_PAY_ID = 23;
	// 公共消息
	public final static String COMMON_MSG_TARGET_TYPE="1"; // 会员

	
	public final static String USED_STATE_USER_NOT_ENOUGH = "0" ; // 邀请人数不足，不能开 
	public final static String USED_STATE_BE_USED = "1" ; // 已经使用过了
	public final static String USED_STATE_AVAILABLE = "2" ; // 可用未使用
	public final static String USED_STATE_IS_NOT_EXPIRED = "3" ; // 未到拆红包时间
	public final static String WITHDRAW_BATCH_USING = "1" ;
	public final static String WITHDRAW_TRADE_STATE_IN_APP = "1" ; // 申请中
	public final static String WITHDRAW_CHK_STATE_WAIT = "1" ; // 待审核
	public final static Integer WITHDRAW_AMT_LIMIT = 500 ;
	
	public final static Integer RED_PACKET_LIMIT_NUM_FST = 3; // 用户第一个红包要三个人
	public final static Integer RED_PACKET_LIMIT_NUM_SEC = 5; // 用户第二个红包要五个人
	public final static Integer RED_PACKET_LIMIT_NUM_MOR = 7; // 用户第三个及以上红包要7个人
	public final static String RED_PACKET_WAY_INVITE = "1" ; // 1：邀请好友；
	public final static String RED_PACKET_WAY_INVITED = "2" ; // 2：被邀请
	public final static String RED_PACKET_START_DATE; // 红包开始计算时间
	
	public final static Integer RED_PACKET_RANGE_CODE_DEFAULT = 1; // 红包范围码 - 默认
	public final static Integer RED_PACKET_RANGE_CODE_INVITED = 4; // 红包范围码 - 被邀请
	/*
	 * 解锁壁纸所需剧点
	 */
	public static final Integer PAY_UNLOCK_WALLPAPER_JPOINT = 10;
	/**
	 * "将邀请码分享给好友，每成功邀请一位好友即送100代金券。",
			"同一个邀请码可同时发送给多人使用，每天一个邀请码只能使用三次。" ,
			"每个新用户只能输入一次邀请码，成功注册即可获得50代金券。" ,
	 */
	public static final String[] INVITE_RULE = {
			"成功邀请3月22日后注册的新用户，可获得抢红包机会。第一次红包邀请3人第二次红包邀请5人，之后每邀请7位可获得一次抢红包机会" , 
			"每位被邀请的新用户拥有一次抢红包机会",
			"抢红包时间：每周五晚20:00 - 每周日晚20:00",
			"有任何问题欢迎咨询客服qq号3278420461"
			} ;
	public static final String SHARE_CONTENT = "有毒！好看到失控的真人漫画:" ; 
	
	/**
	 * notifyType
	 * 1.日志评论的回复 ， 2.评论的回复 ， 3，评论回复的回复，4:系统消息 , 5:追剧消息，  7. 收礼语音回复 ，
	 * 8，拆礼物提醒收礼消息，9：漫画更新提示，11：反馈回复;10:剧圈回复消息12:问卷消息 ;13:会员到期提醒;14:剧娘可回复消息
	 */
	public final static String NOTIFY_TYPE_LOG_COMMENT_REPLY="1";// 日志评论的回复
	public final static String NOTIFY_TYPE_PROJECT_COMMENT="2";// 评论的回复
	public final static String NOTIFY_TYPE_PROJECT_COMMENT_REPLY="3";// 评论回复的回复
	public final static String NOTIFY_TYPE_SYS="4";// 系统消息
	public final static String NOTIFY_TYPE_CHAST_PROJECT="5";// 追剧消息
	public final static String NOTIFY_TYPE_GIFT_SEND="6";// 送礼
	public final static String NOTIFY_TYPE_GIFT_VOICE_MSG="7";// 收礼语音回复
	public final static String NOTIFY_TYPE_GIFT_OPEN="8";// 拆礼物提醒收礼消息
	public final static String NOTIFY_TYPE_CARTOON_UPDATE="9";// 漫画更新提示
	public final static String NOTIFY_TYPE_LOG_COMMENT="10";// 剧圈回复消息
	public final static String NOTIFY_TYPE_FEEDBACK_MSG="11";// 反馈回复
	public final static String NOTIFY_TYPE_QUESTIOIN_MSG="12";// 问卷消息
	public final static String NOTIFY_TYPE_VIP_OUT_DATE="13";// 会员到期提醒
	public final static String NOTIFY_TYPE_REPLY="14";// 剧娘可回复消息
	
	/*
	 *common  
	 */
	public final static String COMMON_MSGINFO_YES_VIP_NOT_EXPIRED="立即续费";// 通用消息-会员未到期提醒-yes
	public final static String COMMON_MSGINFO_YES_VIP_EXPIRED="立即充值";// 通用消息-会员已到期提醒-yes
	public final static String COMMON_MSGINFO_YES_VIP_RECHARGE="充值VIP";// 通用消息充值VIP
	
	public final static String COMMON_MSGINFO_NO_VIP_I_KNOW ="我知道了";// 通用消息-会员到期提醒-no
	public final static String COMMON_MSGINFO_NO_VIP_NOT_EXPIRED="再等等";// 通用消息-会员到期提醒-no
	
	public final static String COMMON_MSGINFO_MSG_VIP_NOT_EXPIRED_START="您的会员";// 通用消息-会员已到期消息提醒
	public final static String COMMON_MSGINFO_MSG_VIP_NOT_EXPIRED_2="还有";// 通用消息-会员已到期消息提醒
	
	public final static String COMMON_MSGINFO_MSG_VIP_NOT_EXPIRED_END="天就到期啦，赶快去续费吧！~";// 通用消息-会员已到期消息提醒
	
	public final static String COMMON_MSGINFO_MSG_VIP_EXPIRED="您的会员特权已到期，赶快去充值吧！~";// 通用消息-会员已到期消息提醒
	public final static String COMMON_MSGINFO_MSG_RESOURCE_PUBLISH_PERMISSION_NO="只有会员宝宝才能发布资源帖哦！~"; // 只有会员宝宝才能发布资源帖哦！~
	public final static String COMMON_MSGINFO_MSG_RESOURCE_QUERY_PERMISSION_NO_VIP="本帖仅对VIP宝宝开放" ; // 会员可看
	public final static String COMMON_MSGINFO_MSG_RESOURCE_QUERY_PERMISSION_NO_LV_START="等级达到" ; // 等级不够头部
	public final static String COMMON_MSGINFO_MSG_RESOURCE_QUERY_PERMISSION_NO_LV_END="级以上才能看到本链接哦~" ; // 等级不够尾部
	/*
	 * 同人作品
	 */
	public static final int  	FAN_CHAPTER_WORD_CNT_LIMIT ; // 单章总字数限制 >140
	public static final int  	FAN_CHAPTER_ITEM_WORD_CNT_LIMIT ; // 单条对话总字数限制<140
	public static final int  	FAN_CHAPTER_ITEM_CNT_LIMIT ; // 单章总条数限制<1000
	
	public static final Integer NOVEL_READING_NUM_MUL  ; // 小说阅读量倍数
	static{
		
		Properties prop = ConfigUtil.readProperty( CFG_BASE_PATH + "Constant.properties" ) ;
		
		USER_PERSONAL_HEAD = Integer.valueOf(prop.getProperty("CONSTANT.USER_PERSONAL_HEAD").toString()) ;
				
		IMG_WIDTH_SMALL = Integer.valueOf(prop.getProperty("CONSTANT.IMG_WIDTH_SMALL").toString()) ;
		
		IMG_WIDTH_MIDDLE = Integer.valueOf(prop.get("CONSTANT.IMG_WIDTH_MIDDLE").toString());
		
		IMG_WIDTH_FOR_NOVEL_TYPE = Integer.valueOf(prop.get("CONSTANT.IMG_WIDTH_FOR_NOVEL_TYPE").toString());
		IMG_HEIGHT_FOR_NOVEL_TYPE = Integer.valueOf(prop.get("CONSTANT.IMG_HEIGHT_FOR_NOVEL_TYPE").toString());
		IMG_WIDTH_FOR_NOVEL_COVER = Integer.valueOf(prop.get("CONSTANT.IMG_WIDTH_FOR_NOVEL_COVER").toString());
		IMG_HEIGHT_FOR_NOVEL_COVER = Integer.valueOf(prop.get("CONSTANT.IMG_HEIGHT_FOR_NOVEL_COVER").toString());
		
		IMG_WIDTH_FOR_NOVEL_DETAIL_COVER = Integer.valueOf(prop.get("CONSTANT.IMG_WIDTH_FOR_NOVEL_DETAIL_COVER").toString());
		IMG_HEIGHT_FOR_NOVEL_DETAIL_COVER = Integer.valueOf(prop.get("CONSTANT.IMG_HEIGHT_FOR_NOVEL_DETAIL_COVER").toString());
		
		HEAD_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.HEAD_WIDTH").toString()) ;
		
		PAPA_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.PAPA_PAGE_SIZE").toString() ) ;
		
		COMMENT_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.COMMENT_PAGE_SIZE").toString() ) ;
		
		LOG_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.LOG_PAGE_SIZE").toString() ) ;
		
		REPLY_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.REPLY_PAGE_SIZE").toString() ) ;
		
		LOG_IMG_SINGLE = Integer.valueOf(prop.getProperty("CONSTANT.LOG_IMG_SINGLE").toString() ) ;
		
		LOG_IMG_MULTIP = Integer.valueOf(prop.getProperty("CONSTANT.LOG_IMG_MULTIP").toString() ) ;
		
		COMMENT_REPLY_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.COMMENT_REPLY_PAGE_SIZE").toString() ) ;
		
		LOG_VIDEO_COVER_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.LOG_VIDEO_COVER_WIDTH").toString() ) ;
		
		LOG_VIDEO_COVER_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.LOG_VIDEO_COVER_HEIGHT").toString() ) ;
		
		COMMON_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.COMMON_PAGE_SIZE").toString() ) ;
		
		LOG_PRAISE_NUM = Integer.valueOf(prop.getProperty("CONSTANT.LOG_PRAISE_NUM").toString() ) ;
		
		HOT_COMMENT_LIMIT = Integer.valueOf(prop.getProperty("CONSTANT.HOT_COMMENT_LIMIT").toString() ) ;
		
//		USER_JPOINT_FOR_INIT_LOGIN = Integer.valueOf(prop.getProperty("CONSTANT.USER_JPOINT_FOR_INIT_LOGIN").toString() ) ;
		
		HOMEPAGE_COVERURL_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.HOMEPAGE_COVERURL_WIDTH").toString() ) ;
		
		HOMEPAGE_COVERURL_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.HOMEPAGE_COVERURL_HEIGHT").toString() ) ;
		
		JPOINT_USER_REGISTER = Integer.valueOf(prop.getProperty("CONSTANT.JPOINT_USER_REGISTER").toString()) ;
		
		MOBILE_CODE_NUM_LIMIT = Integer.valueOf(prop.getProperty("CONSTANT.MOBILE_CODE_NUM_LIMIT").toString() ) ;
		
		HEAL_LIMIT = Integer.valueOf(prop.getProperty("CONSTANT.HEAL_LIMIT").toString() ) ;
		
		USER_JPOINT_FOR_INIT_LOGIN_MAX = Integer.valueOf(prop.getProperty("CONSTANT.USER_JPOINT_FOR_INIT_LOGIN_MAX").toString()) ;
		
		USER_JPOINT_FOR_INIT_LOGIN_MIN = Integer.valueOf(prop.getProperty("CONSTANT.USER_JPOINT_FOR_INIT_LOGIN_MIN").toString()) ;
		
		USER_PHOTO_PAGE_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.USER_PHOTO_PAGE_SIZE").toString()) ;
		
		IMG_WIDTH_FOT_PHOTO = Integer.valueOf(prop.getProperty("CONSTANT.IMG_WIDTH_FOT_PHOTO").toString()) ;
		
		AUDIT_VERSION = prop.getProperty("CONSTANT.AUDIT_VERSION") ;
				
		AUDIT_URL_FOR_RECHARGE = prop.getProperty("CONSTANT.AUDIT_URL_FOR_RECHARGE").toString();
		
		ONLINE_URL_FOR_RECHARGE = prop.getProperty("CONSTANT.ONLINE_URL_FOR_RECHARGE").toString();
		
		GIFT_IMG_THUMB_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.GIFT_IMG_THUMB_WIDTH").toString()) ;
		
		GIFT_IMG_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.GIFT_IMG_WIDTH").toString()) ;
		
//		public final static Integer USER_SPACE_MOVIE_COVER_HEIGHT ;
//		
//		public final static Integer USER_SPACE_MOVIE_COVER_WIDTH ;
		
		USER_SPACE_MOVIE_COVER_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.USER_SPACE_MOVIE_COVER_HEIGHT")) ;
		
		USER_SPACE_MOVIE_COVER_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.USER_SPACE_MOVIE_COVER_WIDTH")) ;
		
		GIFT_LOG_IMG_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.GIFT_LOG_IMG_WIDTH")) ;
		
		GIFT_LOG_IMG_THUMB_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.GIFT_LOG_IMG_THUMB_WIDTH")) ;
		
		USER_PHOTO_IMG_THUMB_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.USER_PHOTO_IMG_THUMB_WIDTH")) ;
		
		USER_PHOTO_IMG_THUMB_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.USER_PHOTO_IMG_THUMB_HEIGHT")) ;
		
		USER_HEAD_IMG_THUMB_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.USER_HEAD_IMG_THUMB_HEIGHT")) ;
		
		USER_HEAD_IMG_THUMB_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.USER_HEAD_IMG_THUMB_WIDTH")) ;
		
		ACTIVITY_LIST_URL_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_LIST_URL_HEIGHT")) ;
		
		ACTIVITY_LIST_URL_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_LIST_URL_WIDTH")) ;
		
		ACTIVITY_DETAIL_URL_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_DETAIL_URL_WIDTH")) ;
		
		ACTIVITY_DETAIL_URL_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_DETAIL_URL_HEIGHT")) ;
		
		ACTIVITY_BOOK_LIST_URL_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_BOOK_LIST_URL_HEIGHT")) ;
		
		ACTIVITY_BOOK_LIST_URL_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_BOOK_LIST_URL_WIDTH")) ;
		
		ACTIVITY_BOOK_URL_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_BOOK_URL_HEIGHT")) ;
		
		ACTIVITY_BOOK_URL_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.ACTIVITY_BOOK_URL_WIDTH")) ;
		
		PROJECT_LIVE_CARTOON_COVER_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.PROJECT_LIVE_CARTOON_COVER_WIDTH")) ;
		PROJECT_LIVE_CARTOON_COVER_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.PROJECT_LIVE_CARTOON_COVER_HEIGHT")) ;
		PROJECT_LIVE_CARTOON_INTERVAL_SIZE = Integer.valueOf(prop.getProperty("CONSTANT.PROJECT_LIVE_CARTOON_INTERVAL_SIZE")) ;
		LIVE_CARTOON_CHAPTER_COVER_WIDTH = Integer.valueOf(prop.getProperty("CONSTANT.LIVE_CARTOON_CHAPTER_COVER_WIDTH")) ;
		LIVE_CARTOON_CHAPTER_COVER_HEIGHT = Integer.valueOf(prop.getProperty("CONSTANT.LIVE_CARTOON_CHAPTER_COVER_HEIGHT")) ;
		
		RED_PACKET_START_DATE =  String.valueOf(prop.getProperty("CONSTANT.RED_PACKET_START_DATE")) ;
		
		USER_JPOINT_FOR_INIT_LOGIN = Integer.valueOf(prop.getProperty("CONSTANT.USER_JPOINT_FOR_INIT_LOGIN")) ;
		USER_COUPON_FOR_SHAR_LIVE_CARTOON_MIN = Integer.valueOf(prop.getProperty("CONSTANT.USER_COUPON_FOR_SHAR_LIVE_CARTOON_MIN")) ;
		USER_COUPON_FOR_SHAR_LIVE_CARTOON_MAX = Integer.valueOf(prop.getProperty("CONSTANT.USER_COUPON_FOR_SHAR_LIVE_CARTOON_MAX")) ;
	
		NOVEL_READING_NUM_MUL = Integer.valueOf(prop.getProperty("CONSTANT.NOVEL_READING_NUM_MUL")) ;
		
		HOT_FAN_IMG_THUMB_WIDTH = Integer.valueOf(prop.get("CONSTANT.HOT_FAN_IMG_THUMB_WIDTH").toString());
		HOT_FAN_IMG_THUMB_HEIGHT = Integer.valueOf(prop.get("CONSTANT.HOT_FAN_IMG_THUMB_HEIGHT").toString());
		
		FAN_CHAPTER_WORD_CNT_LIMIT = Integer.valueOf(prop.get("CONSTANT.FAN_CHAPTER_WORD_CNT_LIMIT").toString());
		FAN_CHAPTER_ITEM_WORD_CNT_LIMIT = Integer.valueOf(prop.get("CONSTANT.FAN_CHAPTER_ITEM_WORD_CNT_LIMIT").toString());
		FAN_CHAPTER_ITEM_CNT_LIMIT = Integer.valueOf(prop.get("CONSTANT.FAN_CHAPTER_ITEM_CNT_LIMIT").toString());
		
		TASK_REWARD_INVITE_FRIEND = Integer.valueOf(prop.get("CONSTANT.TASK_REWARD_INVITE_FRIEND").toString());
		TASK_REWARD_INVITE_FRIEND_7 = Integer.valueOf(prop.get("CONSTANT.TASK_REWARD_INVITE_FRIEND_7").toString());
		TASK_REWARD_INVITED = Integer.valueOf(prop.get("CONSTANT.TASK_REWARD_INVITED").toString());
		TASK_REWARD_INVITE_NUM = Integer.valueOf(prop.get("CONSTANT.TASK_REWARD_INVITE_NUM").toString());
		
		
	}
}
