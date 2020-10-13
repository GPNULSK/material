package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.landa.material.action.struts.Exception_Exception;
import com.landa.material.action.struts.Material;
import com.landa.material.action.struts.MaterialAction;
import com.landa.material.action.struts.MaterialActionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/apply")
public class MaterialController {

    MaterialActionService fac=new MaterialActionService();
    MaterialAction materialAction=fac.getMaterialActionPort();

    @ResponseBody
    @RequestMapping("/material")
    public List<Material> selectMaterialList(String code,String name,String source) throws Exception_Exception {

        System.out.println(name);
        List<Material> materials = materialAction.materialListToVue(code,name,source);
        System.out.println(materials);
        return materials;
    }

    @ResponseBody
    @RequestMapping("/getWarehouse")
    public List<Material> getWarehouse(String warehouse) throws Exception_Exception {
//        String warehouses = materialAction.inquiryBaanServiceToVue(warehouse);
//        List<Material> materialList= JSON.parseArray(warehouse,Material.class);

        String s="[{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"610\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"南水物资库\"},{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"410\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"龙山物资库(用完改010库)\"},{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"010\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"凌达物资库\"}]";


        List<Material> materialList= JSON.parseArray(s,Material.class);
        System.out.println(materialList.toString());
        System.out.println(materialList.get(0));

        return materialList;
    }
}
