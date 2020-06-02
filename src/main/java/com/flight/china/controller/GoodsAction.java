package com.flight.china.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
@ResponseBody
@RestController
public class GoodsAction {

	@Autowired
	public TbGoodsService tbGoodsService;
	
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
                String filepath = "D:\\project\\springBoot\\src\\main\\resources\\static\\infoImages\\" + dateStr+"\\"+uuid+"." + prefix;


                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                map.put("code",0);
                map.put("msg","");
                map.put("data",map2);
                map2.put("src","/infoImages/"+ dateStr+"/"+uuid+"." + prefix);
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