package com.didispace.web.util;


import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * ali json转换
 * @author xiaoxudong
 * @date 2017年6月6日
 */
public class JSONUtils {

    public static String createObjectJson(Object object) {

        if (object != null) {
            JSONObject json = new JSONObject();
            return JSONObject.toJSONString(object);
        } else {
            return null;
        }
    }

    public static Object getObjectByJson(String json, Class<?> classs) {

        //  JSONObject json = new JSONObject();

        Object obj = JSONObject.parseObject(json, classs);

        return obj;
    }



    @SuppressWarnings("unchecked")
    public static Map<String, String> getMapByJson(String json) {

        return (Map<String, String>) getObjectByJson(json, Map.class);

    }

    public static Map<String, Object> getMapObjectByJson(String json) {

        return (Map<String, Object>) getObjectByJson(json, Map.class);

    }

    @SuppressWarnings("unchecked")
    public static List<Map<String, String>> getListMapByJson(String json) {

        return (List<Map<String, String>>) getObjectByJson(json, List.class);

    }

    @SuppressWarnings("unchecked")
    public static Map<String,Object> getMapObjByJson(String json) {
        return (Map<String,Object>)getObjectByJson(json, Map.class);
    }

    public static void main(String[] args) {


        String sss = "[{\"id\":22,\"sid\":\"03\",\"pid\":\"030100\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"工作台\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:13:52 AM\"},{\"id\":23,\"sid\":\"03\",\"pid\":\"030200\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"通话记录\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:28 AM\"},{\"id\":24,\"sid\":\"03\",\"pid\":\"030300\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"常用联系人\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:28 AM\"},{\"id\":25,\"sid\":\"03\",\"pid\":\"030400\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"工单管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:29 AM\"},{\"id\":27,\"sid\":\"03\",\"pid\":\"030600\",\"action\":\"/portal/mguser.htm\",\"descs\":\"客户管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:30 AM\"},{\"id\":28,\"sid\":\"03\",\"pid\":\"030700\",\"action\":\"/portal/mgsys.htm\",\"descs\":\"模块管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:31 AM\"},{\"id\":29,\"sid\":\"03\",\"pid\":\"030800\",\"action\":\"/portal/mgroles.htm\",\"descs\":\"角色权限管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:31 AM\"},{\"id\":30,\"sid\":\"03\",\"pid\":\"030900\",\"action\":\"/portal/mgmenu.htm\",\"descs\":\"菜单管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:31 AM\"},{\"id\":32,\"sid\":\"03\",\"pid\":\"031200\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"助餐上架管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:32 AM\"},{\"id\":33,\"sid\":\"03\",\"pid\":\"031300\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"超市购上架管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:32 AM\"},{\"id\":34,\"sid\":\"03\",\"pid\":\"031400\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"家庭服务上架管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:32 AM\"},{\"id\":35,\"sid\":\"03\",\"pid\":\"031500\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"药品上架管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:32 AM\"},{\"id\":36,\"sid\":\"03\",\"pid\":\"031600\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"志愿者服务上架管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:33 AM\"},{\"id\":38,\"sid\":\"03\",\"pid\":\"031800\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"客户反馈管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:33 AM\"},{\"id\":39,\"sid\":\"03\",\"pid\":\"031900\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"客户分析管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:34 AM\"},{\"id\":40,\"sid\":\"03\",\"pid\":\"032000\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"语音档案管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:35 AM\"},{\"id\":41,\"sid\":\"03\",\"pid\":\"032100\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"联系记录跟踪管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:35 AM\"},{\"id\":43,\"sid\":\"03\",\"pid\":\"032600\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"门店卡券管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:35 AM\"},{\"id\":45,\"sid\":\"03\",\"pid\":\"032300\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"系统通知消息管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:36 AM\"},{\"id\":46,\"sid\":\"03\",\"pid\":\"032400\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"订单消息管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:36 AM\"},{\"id\":47,\"sid\":\"03\",\"pid\":\"032500\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"私信消息管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:36 AM\"},{\"id\":48,\"sid\":\"03\",\"pid\":\"031000\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"订单管理\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:37 AM\"},{\"id\":49,\"sid\":\"03\",\"pid\":\"032800\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"应用参数配置\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:37 AM\"},{\"id\":50,\"sid\":\"03\",\"pid\":\"032900\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"系统日志记录\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:37 AM\"},{\"id\":51,\"sid\":\"03\",\"pid\":\"033000\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"系统数据备份\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:38 AM\"},{\"id\":52,\"sid\":\"03\",\"pid\":\"033100\",\"action\":\"javascript:swal(\\u0027开发中...\\u0027);\",\"descs\":\"系统监控\",\"state\":1,\"isshow\":1,\"lasttime\":\"Jul 8, 2016 11:25:39 AM\"}]";
        String S = "[{\"id\":2205,\"tmfIds\":\"15301,15314\",\"fieldCode\":\"fieldCode\",\"ruleType\":\"S\",\"ruleCode\":\"ruleCode\",\"conditionCode\":\"1\",\"params\":\"params\",\"sceneName\":\"场景名称\",\"sceneDescrib\":\"场景描述\",\"sceneCondition\":\"场景条件\",\"transCode\":\"1\",\"transVersion\":\"1.0\",\"systemId\":44,\"isdelete\":\"0\",\"sceneType\":\"1\"}]";

        System.out.println(getListMapByJson(S));


    }


}
//    public static List<MockCase> getMockCaseByJson(String  json) {
//
//        if(json == null || json.isEmpty()){
//            return null;
//        }
//        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
//        Type typeOfT = new TypeToken<List<MockCase>>(){}.getType();
//        List<MockCase> list= gson.fromJson(json, typeOfT);
//        return list;
//    }
//}
