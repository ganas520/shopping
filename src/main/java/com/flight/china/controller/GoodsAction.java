package com.flight.china.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.flight.china.bean.TbGoods;
import com.flight.china.bean.TbUser;
import com.flight.china.service.TbGoodsService;
import com.flight.china.service.TbUserService;
import com.flight.china.util.ConstantUtils;
import com.flight.china.util.GeneralBasic;
import com.flight.china.util.HmacReturnbyday;
import com.flight.china.util.SKUUtil;
import com.flight.china.util.CoupangMessage;
@ResponseBody
@RestController
public class GoodsAction {

	@Autowired
	public TbGoodsService tbGoodsService;
	
	@Value("${mogu.picture.upload}")
    private String uploadUrl;
	
	@RequestMapping(value = "/getAllGoods")
	public Map<String,Object> getAllGoods(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req){
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		int startWith = (page-1)*rows;
		TbGoods tbGood = new TbGoods();
		tbGood.setStartWith(startWith);
		tbGood.setRows(rows);
		List<TbGoods> tbGoodsList= tbGoodsService.getAllGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", tbGoodsList.size());
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList);
		return map;
	}
	
	
	@RequestMapping(value = "/getAllGoodsLike")
	public Map<String,Object> getAllGoodsLike(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req) throws ParseException{
		int page = Integer.valueOf(req.getParameter("page"));
		int rows = Integer.valueOf(req.getParameter("limit"));
		int startWith = (page-1)*rows;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
		TbGoods tbGood = new TbGoods();
		tbGood.setStartWith(startWith);
		tbGood.setRows(rows);
		String goodsCode = req.getParameter("goodsCode");
		if(!"".equals(goodsCode) && goodsCode != null) {
			tbGood.setGoodsCode(goodsCode);
		}
		String goodsNameChinese = req.getParameter("goodsNameChinese");
		System.out.println("goodsNameChinese:"+goodsNameChinese);
		if(!"".equals(goodsNameChinese) && goodsNameChinese != null) {
			tbGood.setGoodsNameChinese(goodsNameChinese);
		}
		String supplierName = req.getParameter("supplierName");
		if(!"".equals(supplierName) && supplierName != null) {
			tbGood.setSupplierName(supplierName);
		}
		String goodsStatus = req.getParameter("goodsStatus");
		if(!"".equals(goodsStatus) && goodsStatus != null) {
			tbGood.setGoodsStatus(goodsStatus);
		}
		String createTime = req.getParameter("createTime");
		if(!"".equals(createTime) && createTime != null) {
			tbGood.setCreateTime(simpleDateFormat.parse(createTime.trim()));
		}
		String updateTime = req.getParameter("updateTime");
		if(!"".equals(updateTime) && updateTime != null) {
			tbGood.setUpdateTime(simpleDateFormat.parse(updateTime.trim()));
		}
		List<TbGoods> tbGoodsList= tbGoodsService.getGoodsLike(tbGood);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("count", tbGoodsList.size());
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList);
		return map;
	}
	
	
	
	@RequestMapping(value = "/getGoods")
	public Map<String,Object> getGoods(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req){
		List<TbGoods> tbGoodsList= tbGoodsService.getAllGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList.get(0));
		return map;
	}
	
	@RequestMapping(value = "/getGood")
	public Map<String,Object> getGood(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req){
		List<TbGoods> tbGoodsList= tbGoodsService.getAllGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", tbGoodsList);
		return map;
	}
	
	@RequestMapping(value="/deleteGoods")
	public Map<String,Object> deleteGoods(@RequestBody(required=false) TbGoods tbGoods){
		tbGoodsService.deleteGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", 1);
		return map;
	}
	
	@RequestMapping(value="/updateGoods")
	public Map<String,Object> updateGoods(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req){
		int updateCount = tbGoodsService.updateGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", updateCount);
		return map;
	}
	
	private int serverPort;
	
	public String getUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://"+address.getHostAddress() +":"+this.serverPort;
    }
	
	public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
    }
	
	
	@RequestMapping(value="/insertGoods")
	public Map<String,Object> insertGoods(@RequestBody(required=false) TbGoods tbGoods,HttpServletRequest req){
		String sku = SKUUtil.getSku();
		tbGoods.setGoodsCode(sku);
		
//		tbGoods.setGoodsNameChinese(sb.toString());
		int updateCount = tbGoodsService.insertGoods(tbGoods);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "请求成功");
		map.put("code", 0);
		map.put("data", updateCount);
		return map;
	}
	
	
	@ResponseBody
    @RequestMapping(value = "/upload")
    public Map upload(MultipartFile file,HttpServletRequest request){

        String prefix="";
        String dateStr="";
        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                Date date = new Date();
                String uuid = UUID.randomUUID()+"";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                dateStr = simpleDateFormat.format(date);
                //String filepath = uploadUrl+"\\" +uuid+"." + prefix;
				String filepath = uploadUrl+"/" +uuid+"." + prefix;

                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                
                String result = GeneralBasic.generalBasic(filepath);
        		JSONObject jsonObject = new JSONObject(result);
        		JSONArray json = jsonObject.getJSONArray("words_result");
        		StringBuffer sb = new StringBuffer();
        		for(int i = 0; i <json.length(); i++) {
        			String jsonName = String.valueOf(((JSONObject) json.get(i)).get("words"));
        			sb.append(jsonName);
        		}
                
                Map<String,Object> map=new HashMap<>();
                map.put("code",0);
                map.put("msg",uuid+"." + prefix);
                map.put("data",sb.toString());
                return map;
            }

        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","");
        return map;

    }
}