
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.landa.material.action.struts.Exception_Exception;
import com.landa.material.action.struts.Material;
import com.landa.material.action.struts.MaterialAction;
import com.landa.material.action.struts.MaterialActionService;


import java.util.List;


public class WsTest {
    public static void main(String[] args) throws Exception_Exception {
        MaterialActionService fac=new MaterialActionService();
        MaterialAction materialAction=fac.getMaterialActionPort();



//        String s = materialAction.inquiryBaanServiceToVue("60034742");
        String s="[{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"610\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"南水物资库\"},{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"410\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"龙山物资库(用完改010库)\"},{\"QHNDI\":\"0\",\"QORD\":\"0\",\"QHND\":\"0\",\"ITEM\":\"60034742\",\"CWAR\":\"010\",\"DSCA\":\"直接头(铜内丝)(PVC-U给水管) Φ32XRc1寸\",\"DSCA2\":\"凌达物资库\"}]";


        List<Material> materialList= JSON.parseArray(s,Material.class);
        System.out.println(materialList.toString());
        System.out.println(materialList.get(0));

//        List<Material> materials = materialAction.materialListToVue("","内存","");
//        System.out.println(materials);




    }


}
