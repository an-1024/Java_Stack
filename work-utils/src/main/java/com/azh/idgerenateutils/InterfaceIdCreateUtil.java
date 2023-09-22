package com.azh.idgerenateutils;

import cn.hutool.core.map.MapUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class InterfaceIdCreateUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    // 根据渠道code和子渠道code生成id
    public static String channelIdGenerate(String channelCode, String subChannelCode) {
        long id = (channelCode + subChannelCode).hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }

    // 根据 url 生成对应接口的id
    public static String plaInterfaceId (String url) {
        long id = url.hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }

    // 根据提供的接口服务类名和服务编码生成对应接口的id
    public static String outInterfaceId (String className, String outCode) {
        long id = (className + outCode).hashCode() & Long.MAX_VALUE;
        return String.valueOf(id);
    }

    public static Map<String,Object> buildRespOut(String str) throws JsonProcessingException {
        Map map = objectMapper.readValue(str, Map.class);
        if (MapUtil.isEmpty(map)) {
            return new HashMap<>();
        }
        Map object = objectMapper.readValue(String.valueOf(map.get("object")), Map.class);
        if (MapUtil.isEmpty(object)) {
            return new HashMap<>();
        }
        Map result = objectMapper.readValue(String.valueOf(object.get("result")), Map.class);
        if (MapUtil.isEmpty(result)) {
            return new HashMap<>();
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("authCode", result.get("authCode"));
        resultMap.put("authCode", result.get("authCode"));
        resultMap.put("authCode", result.get("authCode"));
        resultMap.put("cgi", result.get("authCode"));
        return map;
    }

    public static void main(String[] args) throws JsonProcessingException {
        String channelId = InterfaceIdCreateUtil.channelIdGenerate("EOMS", "10086gdhjcl-tmh");
        String plaChannelId = InterfaceIdCreateUtil.plaInterfaceId("/ivvr/replacelogQuery");
        String outChannelId = InterfaceIdCreateUtil.outInterfaceId("BjCommonOutService", "OPF_GSM_REPLACELOG_QUERY_001");
        System.out.println("channelId = " + channelId  + "\n" + "outChannelId = " + outChannelId + "\n" + "plaChannelId = " + plaChannelId);
    }
}
