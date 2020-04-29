package com.ruoyi.project.websocket;

import com.ruoyi.framework.web.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo/websocket")
public class DemoWebsocketController extends BaseController {
    private String prefix = "demo/websocket";

    @RequiresPermissions("demo:websocket:view")
    @GetMapping()
    public String socket()
    {
        return prefix + "/websocket";
    }
    @RequiresPermissions("demo:websocket:edit")
    //推送数据接口
    @ResponseBody
    @RequestMapping("/push/{cid}")
    public Map pushToWeb(@PathVariable String cid, String message) {
        if(message==null){
            message = "我是消息44";
        }
        Map result = new HashMap();
        try {
            WebSocketServer.sendInfo(message,cid);
            result.put("code", 200);
            result.put("msg", "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }
}
