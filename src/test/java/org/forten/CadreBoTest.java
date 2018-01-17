package org.forten;

import org.forten.bo.CadreBo;
import org.forten.dto.Message;
import org.forten.entity.Cadre;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CadreBoTest extends BaseTest {
    @Resource
    private CadreBo bo;
    @Test
    public void testDoSave(){
        Cadre cadre = new Cadre();
        cadre.setName("杜甫");
        cadre.setCadreTel("1231581515");
        cadre.setEmail("455448451@qq.com");
        cadre.setGender("男");
        cadre.setWorkNumber("15165451");

        Message m = bo.doSave(cadre);
        assertNotNull(m);
        assertEquals("info",m.getTypeDes());

    }

}
