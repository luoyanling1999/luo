package com.demo.demo.controll;


import com.demo.demo.entity.reader;
import com.demo.demo.service.readerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Test")
public class readerControll {
    @Autowired
    private readerService readerSer;




    @RequestMapping("/selectAll")
    @ResponseBody
    public List<reader> all() {
        List<reader> list = new ArrayList<reader>();
        list=readerSer.selectAll();
        return list;
    }


}
