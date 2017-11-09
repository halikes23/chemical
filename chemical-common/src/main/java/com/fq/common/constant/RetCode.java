package com.fq.common.constant;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 返回结果
 * @author zhen.cheng
 *
 */
public class RetCode {
	
	private static final Logger logger = LoggerFactory.getLogger(RetCode.class) ;
	
	public final static String KEY_RET_CODE = "code" ;
	public final static String KEY_CODE_MSG = "codeMsg";
	
	private final static Map<String,String> unmodifiableMsgs ;
	
//	public final static String KEY_RET_CODE = "Result" ;
//	public final static String KEY_CODE_MSG = "Desc";
	
	@RetCodeElement(value="验证码错误") 
	public final static String MOBILE_CODE_CHECK_WRONG = "21" ; 

	@RetCodeElement(value="漫画信息不存在！") 
	public final static String LIVECARTOON_IS_NOT_EXISTS = "203" ; 

	@RetCodeElement(value="答案不许修改哦") 
	public final static String QUESTION_CAN_NOT_CHANGE = "9003" ; 

	@RetCodeElement(value="该影片已点赞") 
	public final static String MOVIE_IS_LIKED = "4003" ; 

	@RetCodeElement(value="该账户已被封号，请不要散发垃圾信息") 
	public final static String USER_IS_REFUSE = "130" ; 

	@RetCodeElement(value="请求参数错误") 
	public final static String PARAMS_PARAM = "06" ; 

	@RetCodeElement(value="“我的书架”标记已经存在,请重填!") 
	public final static String NOVEL_TYPE_ALREADY_EXISTS_THREE = "11006" ; 

	@RetCodeElement(value="无匹配的结果") 
	public final static String MOBILE_IS_NONE = "53" ; 

	@RetCodeElement(value="该渠道存在漫画，删除前请先删除该渠道漫画！") 
	public final static String CHANNEL_IS_EXISTS_CARTOON = "14000" ; 

	@RetCodeElement(value="该影片已被作者删除") 
	public final static String MOVIE_IS_NOT_EXISTS = "3090" ; 

	@RetCodeElement(value="亲，配音错位了呢~赶快放到正确的位置吧") 
	public final static String LIVE_CARTOON_LOCATION_IS_USELESS = "4109" ; 

	@RetCodeElement(value="除模板简介外，模板信息不能为空！") 
	public final static String FAN_MODEL_INFO_IS_EMPTY = "170020" ; 

	@RetCodeElement(value="评论不存在") 
	public final static String COMMENT_IS_NULL = "4040" ; 

	@RetCodeElement(value="该账户已被禁言，请不要散发垃圾信息") 
	public final static String USER_IS_GAG = "131" ; 

	@RetCodeElement(value="配音信息不存在") 
	public final static String LIVE_CARTOON_DUBBING_IS_NULL = "4108" ; 

	@RetCodeElement(value="活动信息不存在") 
	public final static String ACTIVE_IS_NOT_VISIABLE = "163" ; 

	@RetCodeElement(value="未选择资源分类") 
	public final static String QINIU_RESOURCE_TYPE_WRONG = "142" ; 

	@RetCodeElement(value="礼单不存在") 
	public final static String GIFT_GIVING_NOT_EXISTS = "2002" ; 

	@RetCodeElement(value="该帖子已被删除") 
	public final static String PROJECT_LOG_DOSE_NOT_EXISTS = "4060" ; 

	@RetCodeElement(value="不能重复点赞") 
	public final static String IS_PRAISE = "4011" ; 

	@RetCodeElement(value="过于频繁的手机验证码请求") 
	public final static String TOO_MORE_MOBLE_CODE_REQUEST = "09" ; 

	@RetCodeElement(value="还没有输入内容哟") 
	public final static String FAN_ITEM_CONTENT_CAN_NOT_BE_NULL = "170016" ; 

	@RetCodeElement(value="操作无效") 
	public final static String USER_CHASE_PROJECT_ERROR = "4055" ; 

	@RetCodeElement(value="同一个用户账号只能领取一次") 
	public final static String ACTIVE_ACCOUNT_IS_USED = "162" ; 

	@RetCodeElement(value="用户上传头像为空") 
	public final static String USER_HEAD_IS_NULL = "4008" ; 

	@RetCodeElement(value="订单已完成") 
	public final static String ORDER_ALREADY_FINISHED = "153" ; 

	@RetCodeElement(value="无法连接到指定的redis") 
	public final static String REDIS_CANNOT_OPEN_CONNECTION = "9903" ; 

	@RetCodeElement(value="七牛服务异常") 
	public final static String QINIU_SERVER_ERROR = "140" ; 

	@RetCodeElement(value="主角信息已经存在！") 
	public final static String MODEL_LEAD_ROLE_IS_EXISTS = "170022" ; 

	@RetCodeElement(value="提现赏金数量不能为空或小于0!!!") 
	public final static String REWARD_AMT_NOT_ZERO = "10003" ; 

	@RetCodeElement(value="投票数量不能小于1") 
	public final static String NOVEL_VOTE_INITIATE_EXCPTION = "11011" ; 

	@RetCodeElement(value="微博登陆失败") 
	public final static String LOGIN_BY_WEIBO_ERROR = "1003" ; 

	@RetCodeElement(value="账号已经存在") 
	public final static String ADMIN_HAS_EXISTS = "50" ; 

	@RetCodeElement(value="不支持的命令") 
	public final static String REDIS_UNSUPPORT_COMMAND = "9905" ; 

	@RetCodeElement(value="参数无效") 
	public final static String WRONG_PARAM = "62" ; 

	@RetCodeElement(value="来晚了宝宝，红包活动咔嚓结束了") 
	public final static String RED_PACKET_ACTIVE_CLOSED = "5122" ; 

	@RetCodeElement(value="无此用户") 
	public final static String THIRD_CL_SMS_ACCOUNT_NOTEXISTS = "3001000101" ; 

	@RetCodeElement(value="") 
	public final static String ORDER_ERROR = "150" ; 

	@RetCodeElement(value="已经上架的章节不能修改哦") 
	public final static String FAN_CHAPTER_CAN_NOT_BE_CHANGE = "170017" ; 

	@RetCodeElement(value="所选绑定漫画列表为空 , 请重填！") 
	public final static String CARTOON_IS_EMPTY = "12002" ; 

	@RetCodeElement(value="角色数量不能超过20个！") 
	public final static String MODEL_ROLE_NUM_MORE = "170025" ; 

	@RetCodeElement(value="该影片未点赞") 
	public final static String MOVIE_IS_NOT_LIKED = "4004" ; 

	@RetCodeElement(value="数据异常") 
	public final static String DATA_ERROR = "98" ; 

	@RetCodeElement(value="暂无热门评论") 
	public final static String HOT_COMMENT_IS_NULL = "4041" ; 

	@RetCodeElement(value="星号标记的信息内容不能为空，请确认重填！") 
	public final static String ACCOUNT_INFO_EMPTY = "16000" ; 

	@RetCodeElement(value="用户信息不存在！") 
	public final static String CP_INFO_NOT_EXISTS = "201" ; 

	@RetCodeElement(value="您已分享过了") 
	public final static String LIVE_CARTOON_LOCATION_IS_SHARED = "4111" ; 

	@RetCodeElement(value="成功") 
	public final static String SUCCESS = "0" ; 

	@RetCodeElement(value="暂无主角信息 ，请先创建主角信息！") 
	public final static String MODEL_RPE_MAIN_ROLE = "170024" ; 

	@RetCodeElement(value="获取图片URL失败") 
	public final static String GET_IMG_URL_ERROR = "42" ; 

	@RetCodeElement(value="用户还没有追呢") 
	public final static String LIVE_CARTOON_HAVE_NOT_CHASED = "4104" ; 

	@RetCodeElement(value="商品不存在") 
	public final static String PRODUCT_IS_NOT_EXIST = "1111" ; 

	@RetCodeElement(value="未选择漫画，请确认重新选择！") 
	public final static String CARTOON_LIST_IS_EMPTY = "14002" ; 

	@RetCodeElement(value="宝宝反应慢稍等一下啦~十秒之内请勿多次点击，谢谢啦~~~") 
	public final static String CAN_NOT_RECOMMENT = "4053" ; 

	@RetCodeElement(value="密码错") 
	public final static String THIRD_CL_SMS_WRONG_PASSWORD = "3001000102" ; 

	@RetCodeElement(value="查询结果为空") 
	public final static String ACCT_NULL = "102" ; 

	@RetCodeElement(value="IOS订单暂时不能对账") 
	public final static String ORDER_IOS_FAILED = "155" ; 

	@RetCodeElement(value="该用户还没有点赞") 
	public final static String IS_NOT_PRAISE = "4012" ; 

	@RetCodeElement(value="30s内弹幕不可重复发送") 
	public final static String BULLET_SCREEN_CAN_NOT_REPEAT_SEND = "4014" ; 

	@RetCodeElement(value="账户不存在或密码错误") 
	public final static String WRONG_MOBILENUM = "60" ; 

	@RetCodeElement(value="剧点兑换失败") 
	public final static String EXCHANGE_ERROR = "7002" ; 

	@RetCodeElement(value="系统异常") 
	public final static String SYSTEM_ERROR = "99" ; 

	@RetCodeElement(value="请求数据缺失") 
	public final static String LOST_PARAM = "03" ; 

	@RetCodeElement(value="数据重复，请确认重填！") 
	public final static String INCOME_IS_EMPTY = "14003" ; 

	@RetCodeElement(value="手机验证码生成失败") 
	public final static String MOBILE_CODE_CREATE_ERROR = "22" ; 

	@RetCodeElement(value="用户已经追过了") 
	public final static String LIVE_CARTOON_HAVE_CHASED = "4103" ; 

	@RetCodeElement(value="小说类型名称已经存在,请重填！") 
	public final static String NOVEL_TYPE_ALREADY_EXISTS = "11005" ; 

	@RetCodeElement(value="该影片已收藏") 
	public final static String MOVIE_IS_COLLECTED = "4001" ; 

	@RetCodeElement(value="答案字数太短") 
	public final static String QUESTION_ANSWER_LENGTH_TOO_SHOT = "9005" ; 

	@RetCodeElement(value="无效头像链接！！") 
	public final static String PIC_URL_ERROR = "1004" ; 

	@RetCodeElement(value="不能使用自己的兑换码哦") 
	public final static String USER_INVITE_CODE_THEMSELF = "129" ; 

	@RetCodeElement(value="获取融云TOKEN失败") 
	public final static String RONGCLOUD_GET_TOKEN_FAIL = "41" ; 

	@RetCodeElement(value="加血量不能低于下限") 
	public final static String HEAL_CANNOT_UNDER_LIMIT = "5104" ; 

	@RetCodeElement(value="数据库异常") 
	public final static String DATABASE_EXCEPTION = "12" ; 

	@RetCodeElement(value="同一个手机设备只能领取一次") 
	public final static String ACTIVE_DEVICE_IS_USED = "160" ; 

	@RetCodeElement(value="水军手机号或昵称不能为空！") 
	public final static String NAVY_INFO_IS_EMPTY = "13000" ; 

	@RetCodeElement(value="输入错误次数超过10次 。 请明天再试") 
	public final static String ERROR_MORE_THAN_TEN = "5010" ; 

	@RetCodeElement(value="同一台手机不能多次操作哦") 
	public final static String USER_INVITE_CODE_SAME_EQUIPMENT = "127" ; 

	@RetCodeElement(value="数据异常") 
	public final static String BATCHTASK_DATA_EXCEPTION = "10001" ; 

	@RetCodeElement(value="数据重复！") 
	public final static String CHANNEL_INCOME_IS_EXISTS = "14005" ; 

	@RetCodeElement(value="该礼品已下架") 
	public final static String GIFT_IS_NOT_EXISTS = "2001" ; 

	@RetCodeElement(value="小说更新提示到期日期不能为空！") 
	public final static String NOVEL_UPDATE_TIPSDT_IS_EMPTY = "11012" ; 

	@RetCodeElement(value="访问REDIS是只读的") 
	public final static String REDIS_IS_READONLY = "9902" ; 

	@RetCodeElement(value="提现渠道未绑定") 
	public final static String WALLET_WITHDRAW_CHANNEL_IS_UNBIND = "5111" ; 

	@RetCodeElement(value="该图片路径地址不靠谱,请用本地文件上传！") 
	public final static String QINIU_SERVER_ERROR_URL = "145" ; 

	@RetCodeElement(value="该分组存在小说信息,不能删除！") 
	public final static String GROUP_IS_EXISTS_NOVEL = "12004" ; 

	@RetCodeElement(value="订单信息不存在，请核实订单信息") 
	public final static String ORDER_NOT_EXISTS = "151" ; 

	@RetCodeElement(value="答案不完整呢，再想想~~") 
	public final static String QUESTION_ANSWER_SIZE_NOT_ENOUGH = "9006" ; 

	@RetCodeElement(value="操作无效") 
	public final static String USER_PRAISE_ERROR = "4013" ; 

	@RetCodeElement(value="启动页无更新") 
	public final static String COMMON_START_PAGE_NULL = "6001" ; 

	@RetCodeElement(value="该小说没有绑定分组，暂不能上架！请先确认绑定分组！") 
	public final static String NOVEL_IS_NOT_GROUP = "11009" ; 

	@RetCodeElement(value="任务周期时间设置有误！") 
	public final static String TASK_TIME_ERROR = "180001" ; 

	@RetCodeElement(value="您不能修改别人的配音信息哦") 
	public final static String LIVE_CARTOON_DUBBING_HAVE_NO_PERMISION = "4107" ; 

	@RetCodeElement(value="用户不在剧组成员中") 
	public final static String USER_IS_NOT_IN_CREW = "124" ; 

	@RetCodeElement(value="该集还在制作中") 
	public final static String LIVE_CARTOON_IS_NULL = "4102" ; 

	@RetCodeElement(value="系统未到提现时间") 
	public final static String WALLET_WITHDRAW_NOT_EXPIRED = "5114" ; 

	@RetCodeElement(value="好感关系不存在") 
	public final static String LIKING_REL_NOT_EXITS = "2003" ; 

	@RetCodeElement(value="当前投票用户太多了，请稍后再试") 
	public final static String QUERY_NOVEL_VOTE_EXCPTION = "11010" ; 

	@RetCodeElement(value="项目分组描述为空 , 请重填！") 
	public final static String GROUP_DESC_IS_EMPTY = "12000" ; 

	@RetCodeElement(value="嗷呜~上架失败啦") 
	public final static String FAN_CHAPTER_COMMIT_FAILURE = "170018" ; 

	@RetCodeElement(value="该渠道已经存在，请确认重新添加！") 
	public final static String CHANNEL_NAME_IS_EXISTS = "14001" ; 

	@RetCodeElement(value="章节评论不存在") 
	public final static String FAN_CHAPTER_COMMIT_NOT_EXISTS = "170026" ; 

	@RetCodeElement(value="访问方式必须为POST") 
	public final static String NOT_POST = "01" ; 

	@RetCodeElement(value="微信登陆失败") 
	public final static String LOGIN_BY_WEIXIN_ERROR = "1002" ; 

	@RetCodeElement(value="该消息已不存在") 
	public final static String NOTIFICATION_IS_NOT_VISIABLE = "4052" ; 

	@RetCodeElement(value="所选绑定小说列表为空 , 请重选！") 
	public final static String NOVEL_IS_EMPTY = "12003" ; 

	@RetCodeElement(value="任务周期时间设置有误！") 
	public final static String DATE_ERROR = "180002" ; 

	@RetCodeElement(value="候选人员之间不能互相赠送选票") 
	public final static String OSCAR_ACTIVE_ACTOR_CANNOT_SEND_VOTE_TO_OTHERS = "8221" ; 

	@RetCodeElement(value="不能为空") 
	public final static String CANNOT_NULL = "97" ; 

	@RetCodeElement(value="活动信息不存在") 
	public final static String OSCAR_ACTIVE_IS_NOT_VISIBLE = "8200" ; 

	@RetCodeElement(value="壁纸信息不存在") 
	public final static String PROJECT_WALLPAPER_NOT_EXISTS = "4110" ; 

	@RetCodeElement(value="该用户已存在") 
	public final static String USER_IS_ALREADY_EXISTS = "122" ; 

	@RetCodeElement(value="该兑换码已领取过") 
	public final static String LOST_CDKEY = "5002" ; 

	@RetCodeElement(value="无漫画权限") 
	public final static String NO_CARTOON_PRI = "205" ; 

	@RetCodeElement(value="性别输入有误") 
	public final static String WRONG_SEX = "61" ; 

	@RetCodeElement(value="获取播放地址失败") 
	public final static String GET_PLAY_URL_ERROR = "15" ; 

	@RetCodeElement(value="模板名称和简介限制15字以内！") 
	public final static String MODEL_WORD_IS_TOO_LANG = "170023" ; 

	@RetCodeElement(value="已经领取过了哦~") 
	public final static String EXCHANGE_ERROR_REPEAT_RECEIVE = "7003" ; 

	@RetCodeElement(value="条目不能为空") 
	public final static String FAN_CHAPTER_ITEM_CAN_NOT_BE_NULL = "17001" ; 

	@RetCodeElement(value="未关注该用户") 
	public final static String IS_NOT_ATTENTION = "4006" ; 

	@RetCodeElement(value="所选绑定项目列表为空 , 请重选！") 
	public final static String PROJECT_IS_EMPTY = "12001" ; 

	@RetCodeElement(value="兑换已经结束") 
	public final static String CDKEY_OUT_OF_DATE = "5004" ; 

	@RetCodeElement(value="亲你已经被邀请过了") 
	public final static String USER_INVITE_CODE_IS_INVITED = "128" ; 

	@RetCodeElement(value="所填数据请最多保留2位小数！") 
	public final static String RATIO_FORMAT_ERROR = "15000" ; 

	@RetCodeElement(value="答案字数太长") 
	public final static String QUESTION_ANSWER_LENGTH_TOO_LONG = "9004" ; 

	@RetCodeElement(value="时间到了才能打开红包") 
	public final static String RED_PACKET_NOT_NOT_EXPIRED = "5120" ; 

	@RetCodeElement(value="时间格式不正确") 
	public final static String WRONG_DATE_FORMAT = "06" ; 

	@RetCodeElement(value="活动已截至") 
	public final static String OSCAR_ACTIVE_IS_OUT_OF_DATE = "8201" ; 

	@RetCodeElement(value="用户不能打赏自己") 
	public final static String CAN_NOT_REWARD_USERSELF = "4007" ; 

	@RetCodeElement(value="候选人信息不存在") 
	public final static String OSCAR_ACTIVE_ACTOR_IS_NOT_VISIBLE = "8220" ; 

	@RetCodeElement(value="暂时没有新的任务") 
	public final static String TASK_INFO_IS_NULL = "7001" ; 

	@RetCodeElement(value="活动已过期") 
	public final static String ACTIVITY_IS_NOT_VISIBLE = "8001" ; 

	@RetCodeElement(value="你这个自恋狂，关注自己干嘛!!!!") 
	public final static String CAN_NOT_ATTENTION_YOURSELF = "4015" ; 

	@RetCodeElement(value="提现订单信息有误") 
	public final static String WALLET_WITHDRAW_APP_ORDER_ERROR = "5113" ; 

	@RetCodeElement(value="该兑换码不存在") 
	public final static String CDKEY_IS_NULL = "5001" ; 

	@RetCodeElement(value="影片节点信息不存在") 
	public final static String MOVIE_NODE_IS_NOT_EXISTS = "3091" ; 

	@RetCodeElement(value="用户可用赏金数不足!!!") 
	public final static String REWARD_AMT_UNDER_BOUNTY = "10004" ; 

	@RetCodeElement(value="该用户不存在") 
	public final static String USER_IS_NOT_VISIBLE = "120" ; 

	@RetCodeElement(value="小说类型名称不能为空!") 
	public final static String NOVEL_TYPE_NOT_EMPTY = "11008" ; 

	@RetCodeElement(value="pingpp订单未支付") 
	public final static String ORDER_PINGPP_PAID_FAILED = "154" ; 

	@RetCodeElement(value="同一个手机号只能领取一次") 
	public final static String ACTIVE_MOBILE_IS_USED = "161" ; 

	@RetCodeElement(value="渠道收入和保底金不能同时输入！") 
	public final static String CHANNEL_DATA_ERROR = "14006" ; 

	@RetCodeElement(value="请求参数缺失！") 
	public final static String PARAM_NOT_FULL = "202" ; 

	@RetCodeElement(value="该用户名已被使用了哦，再换一个吧") 
	public final static String USER_NICK_IS_ALREADY_EXISTS = "123" ; 

	@RetCodeElement(value="访问redis服务器失败") 
	public final static String REDIS_ACCESS_REDIS_SERVER_ERROR = "9904" ; 

	@RetCodeElement(value="访问魔窗接口失败！") 
	public final static String ACCESS_MAGICWINDOW_API_ERROR = "15" ; 

	@RetCodeElement(value="状态不正确") 
	public final static String BATCHTASK_STATE_WRONG = "10002" ; 

	@RetCodeElement(value="选票无效") 
	public final static String OSCAR_ACTIVE_VOTE_IS_NOT_VISIBLE = "8210" ; 

	@RetCodeElement(value="“全部类型”标记已经存在,请重填！") 
	public final static String NOVEL_TYPE_ALREADY_EXISTS_TWO = "11007" ; 

	@RetCodeElement(value="模板角色名称或头像不能为空！") 
	public final static String MODEL_ROLE_NAME_IS_EMPTY = "170021" ; 

	@RetCodeElement(value="项目日志评论发表失败") 
	public final static String PROJECT_LOG_POST_COMMENT_ERROR = "4061" ; 

	@RetCodeElement(value="资源帖标题过长") 
	public final static String PROJECT_LOG_RESOURCE_TITLE_TOO_LONG = "4071" ; 

	@RetCodeElement(value="只有主人才能修改哟") 
	public final static String FAN_ERROR_HAVE_NO_PERMISSION = "17008" ; 

	@RetCodeElement(value="该类型不存在") 
	public final static String NOVEL_TYPE_NOT_EXISTS = "11001" ; 

	@RetCodeElement(value="此兑换码已失效") 
	public final static String USER_INVITE_CODE_IS_INVALID = "125" ; 

	@RetCodeElement(value="此兑换码今天用不了呢明天来试试吧") 
	public final static String USER_INVITE_CODE_IS_BEYOND = "126" ; 

	@RetCodeElement(value="用户不能回复自己") 
	public final static String CAN_NOT_REPLY_USERSELF = "4021" ; 

	@RetCodeElement(value="只有相邻的对话才能上下移动哟") 
	public final static String FAN_ITEM_IN_DIFFRENT_CHAPTER = "17013" ; 

	@RetCodeElement(value="数据不完整！") 
	public final static String CHANNEL_AND_CARTOON_IS_EMPTY = "14004" ; 

	@RetCodeElement(value="分享成功") 
	public final static String USER_HAD_SHARED = "132" ; 

	@RetCodeElement(value="所有redis服务访问异常") 
	public final static String REDIS_ACCESS_ALL_SERVER_ERR = "9900" ; 

	@RetCodeElement(value="") 
	public final static String HAS_BEAN_FRIEND = "51" ; 

	@RetCodeElement(value="获取七牛TOKEN失败！") 
	public final static String CREATE_QINIU_TOKEN_ERROR = "14" ; 

	@RetCodeElement(value="资源类型错误") 
	public final static String QINIU_RESOURCE_SUFFIX_WRONG = "141" ; 

	@RetCodeElement(value="查询过快（30秒查询一次）") 
	public final static String THIRD_CL_SMS_QUERY_TO_FAST = "3001000103" ; 

	@RetCodeElement(value="用户没有相关权限") 
	public final static String USER_DOES_NOT_HAVE_PERMISSIONS = "121" ; 

	@RetCodeElement(value="这是一个无效的红包") 
	public final static String RED_PACKET_INVALID = "5121" ; 

	@RetCodeElement(value="真人漫画还在制作中") 
	public final static String PROJECT_LIVE_CARTOON_IS_NULL = "4101" ; 

	@RetCodeElement(value="上传文件失败") 
	public final static String UPLOAD_FILE_FAILED = "11" ; 

	@RetCodeElement(value="提交过于频繁") 
	public final static String COMMIT_TOO_FREQUENTLY = "16" ; 

	@RetCodeElement(value="该话题已被删除") 
	public final static String TOPIC_IS_NOT_VISIBLE = "110" ; 

	@RetCodeElement(value="发送短息验证码失败") 
	public final static String SEND_CREATE_MOBLE_CODE_FAIL = "10" ; 

	@RetCodeElement(value="用户余额不足") 
	public final static String USER_JPOINT_IS_NOT_FULL = "4009" ; 

	@RetCodeElement(value="此活动只针对新注册用户哦！") 
	public final static String ACTIVE_ONLY_NEW_REGISTER = "164" ; 

	@RetCodeElement(value="qq登陆失败") 
	public final static String LOGIN_BY_QQ_ERROR = "1001" ; 

	@RetCodeElement(value="该章节已屏蔽") 
	public final static String NOVEL_CHAPTER_NOT_EXISTS = "11003" ; 

	@RetCodeElement(value="用户钱包余额不足") 
	public final static String WALLET_IS_NOT_ENOUGH = "5110" ; 

	@RetCodeElement(value="补单申请失败，点击申诉，宝宝别急48小时内肯定处理哟！") 
	public final static String ORDER_SUPPLEMENT_FAILED = "152" ; 

	@RetCodeElement(value="问卷信息不存在") 
	public final static String QUESTION_IS_NOT_VISIBLE = "9001" ; 

	@RetCodeElement(value="融云服务器请求失败") 
	public final static String RONGCLOUD_ACCESS_ERROR = "40" ; 

	@RetCodeElement(value="该帐号已超过绑定限制") 
	public final static String WALLET_CHANNEL_BIND_TOO_MANY = "5115" ; 

	@RetCodeElement(value="提交成功！请耐心等待审核结果~") 
	public final static String FAN_CHAPTER_COMMIT_NEED_CHECK = "170019" ; 

	@RetCodeElement(value="此章节离家出走了QAQ") 
	public final static String FAN_CHAPTER_INFO_NOT_EXISTS = "17003" ; 

	@RetCodeElement(value="提现批次异常") 
	public final static String WALLET_WITHDRAW_BATCH_EXCEPTION = "5112" ; 

	@RetCodeElement(value="该小说已下架") 
	public final static String NOVEL_INFO_NOT_EXISTS = "11002" ; 

	@RetCodeElement(value="解锁啦！磕头咚咚") 
	public final static String LIVE_CARTOON_HAVE_PERMISION = "4105" ; 

	@RetCodeElement(value="操作太频繁了，稍后再试试吧") 
	public final static String LIVE_CARTOON_SHARED_TOO_OFTEN = "4120" ; 

	@RetCodeElement(value="该消息内容太长") 
	public final static String NOTIFICATION_REPLY_MSG_OUT_OF_RANG = "4051" ; 

	@RetCodeElement(value="评论失败") 
	public final static String COMMENT_MISS = "4010" ; 

	@RetCodeElement(value="角色已经存在") 
	public final static String ROLE_HAS_EXISTS = "51" ; 

	@RetCodeElement(value="该影片未收藏") 
	public final static String MOVIE_IS_NOT_COLLECTED = "4002" ; 

	@RetCodeElement(value="您还没有解锁哦") 
	public final static String LIVE_CARTOON_HAVE_NO_PERMISION = "4106" ; 

	@RetCodeElement(value="账户或密码错误") 
	public final static String WRONG_PASSWORD = "05" ; 

	@RetCodeElement(value="小说来源不能为空！") 
	public final static String NOVEL_BOOK_SOURCE_IS_EMPTY = "11013" ; 

	@RetCodeElement(value="条目信息不存在") 
	public final static String FAN_ITEM_NOT_EXISTS = "17012" ; 

	@RetCodeElement(value="该章节已锁(需解锁") 
	public final static String NOVEL_CHAPTER_HAVE_NO_PERMISSION = "11005" ; 

	@RetCodeElement(value="不支持的图片格式格式") 
	public final static String UNSUPPORT_FILE_SUFFIX = "13" ; 

	@RetCodeElement(value="漫画章节信息不存在！") 
	public final static String CARTOONCHAPTER_IS_NOT_EXISTS = "204" ; 

	@RetCodeElement(value="注册用户已存在") 
	public final static String MOBILE_EXISTS = "04" ; 

	@RetCodeElement(value="不能重复关注") 
	public final static String CAN_NOT_REATTENTION = "4005" ; 

	@RetCodeElement(value="项目不存在") 
	public final static String PROJECT_IS_NULL = "4032" ; 

	@RetCodeElement(value="项目加血已经结束") 
	public final static String PROJECT_IS_HEAL_FULL = "4051" ; 

	@RetCodeElement(value="不能重复使用哦") 
	public final static String CDKEY_BEYOND_LIMIT = "5005" ; 

	@RetCodeElement(value="该消息已回复过") 
	public final static String NOTIFICATION_HAVE_REPLIED = "4053" ; 

	@RetCodeElement(value="图片数量过多") 
	public final static String IMGS_NUM = "101" ; 

	@RetCodeElement(value="您的赏金不足") 
	public final static String USER_REWARD_NOT_ENOUGH = "133" ; 

	@RetCodeElement(value="") 
	public final static String TRADE_CHECK_ERROR = "1109" ; 

	@RetCodeElement(value="还未到兑换日期") 
	public final static String CDKEY_NOT_YET_STARTED = "5003" ; 

	@RetCodeElement(value="TOKEN失效") 
	public final static String LOSE_TOKEN = "08" ; 

	@RetCodeElement(value="redis 没有访问权限") 
	public final static String REDIS_LIMIT_ACCESS_PREMISSION = "9901" ; 

	@RetCodeElement(value="项目日志评论不存在") 
	public final static String PROJECT_LOG_COMMENT_DOES_NOT_EXISTS = "4062" ; 

	@RetCodeElement(value="本页面超时已过期") 
	public final static String QUESTION_IS_OUT_OF_DATE = "9002" ; 

	@RetCodeElement(value="加血量不能小于0") 
	public final static String HEAL_AMOUNT_ERROR = "4052" ; 

	@RetCodeElement(value="此作品已被恶犬吃掉") 
	public final static String FAN_INFO_NOT_EXISTS = "17002" ; 

	
	static {
		
		System.out.println("loading ... ");
		Map<String,String> msgs = new HashMap<String,String>() ;
		Field[] fields = RetCode.class.getDeclaredFields() ;
		for(Field field : fields){
			
			RetCodeElement element = field.getAnnotation(RetCodeElement.class) ;
			if(element != null){
				System.out.println(field.getName() + " : " + element.value());
				try {
					msgs.put((String)field.get(RetCode.class), element.value()) ;
				}catch (Exception e) {
					logger.error("RetCode 加载失败",e);
				}
			}
			
		}
		unmodifiableMsgs = java.util.Collections.unmodifiableMap( msgs ) ;
		
	}
	
	public static void main(String[] args) {
		Map<String,Object> success = RetCode.buildRetCodeResult(RetCode.SUCCESS) ;
		System.out.println(success);
	}

	
	
	/**
	 * 根据code 返回对应描述
	 * @param code
	 * @return
	 */
	public final static String RET_CODE_MSG( String code ){
		
		return unmodifiableMsgs.get( code ) ;
		
	}
	
	/**
	 * 生成结果返回MAP
	 * @param code
	 * @return
	 */
	public static Map<String,Object> buildRetCodeResult( String code ){
		Map<String,Object> rst = new HashMap<String,Object>() ;
		rst.put( KEY_RET_CODE , code ) ;
		rst.put( KEY_CODE_MSG , RET_CODE_MSG( code )) ;
		return rst ;
	}
	
}
