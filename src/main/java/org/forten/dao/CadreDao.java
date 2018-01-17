package org.forten.dao;

import org.forten.dto.qo.CadreQo;
import org.forten.dto.vo.CadreVo;

import java.util.List;

public interface CadreDao {
    long queryCountForCadre(CadreQo qo);
    List<CadreVo>queryForCadre(CadreQo qo);
}
