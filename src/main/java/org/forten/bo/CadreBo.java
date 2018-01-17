package org.forten.bo;

import org.apache.ibatis.session.SqlSession;
import org.forten.dao.CadreDao;
import org.forten.dao.HibernateDao;
import org.forten.dao.MybatisDao;
import org.forten.dto.Message;
import org.forten.dto.PageInfo;
import org.forten.dto.PagedRo;
import org.forten.dto.qo.CadreQo;
import org.forten.dto.ro.PagedRoForEasyUI;
import org.forten.dto.vo.CadreVo;
import org.forten.entity.Cadre;
import org.forten.utils.system.ValidateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("cadreBo")
public class CadreBo {
    @Resource
    private HibernateDao dao;
    @Resource
    private MybatisDao mybatisDao;
    @Transactional
    public Message doSave(Cadre cadre){
        ValidateUtil.validate(cadre);
        try {
            dao.save(cadre);
            return Message.info("保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return Message.error("保存失败");

        }
    }
    @Transactional(readOnly = true)
    public PagedRoForEasyUI<CadreVo>queryBy(CadreQo qo){
        CadreDao cadredao = getCadreDao();
        long count = cadredao.queryCountForCadre(qo);
        if (count == 0){
            return new PagedRoForEasyUI<>(new PagedRo<>());
        }
        PageInfo page = PageInfo.getInstance(qo.getPage(),qo.getRows(),(int)count);

        qo.setFirst(page.getFirst());
        List<CadreVo> list = cadredao.queryForCadre(qo);
        return new PagedRoForEasyUI<>(new PagedRo<>(list,page));

    }
    private CadreDao getCadreDao(){
        SqlSession session = mybatisDao.openSession();
        return session.getMapper(CadreDao.class);
    }
}
