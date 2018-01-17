package org.forten.action;

import org.forten.bo.CadreBo;
import org.forten.dto.Message;
import org.forten.entity.Cadre;
import org.forten.utils.common.StringUtil;
import org.forten.utils.system.ValidateException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class CadreAction {
    @Resource
    private CadreBo bo;
    @PostMapping("/cadre")
    public @ResponseBody
    Message save(@RequestBody Cadre cadre){
        try{
            return  bo.doSave(cadre);

        }catch (ValidateException e){
            return Message.error(StringUtil.join(e.getMessages(),"<br>"));

        }
    }


}
