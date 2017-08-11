package com.puhuijia.back.dao.borrow.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.puhuijia.commons.borrow.model.BorrowInfo;

/**
 * <p>Copyright © JinNuoFeng Network Technology Co.,Ltd.</p>
 * Created by Alan on 2017/8/9.
 */
public interface BorrowInfoMapper extends BaseMapper<BorrowInfo> {

    /**
     * @author ZhangHongYu
     * @description 通过borrowId查询出标的信息
     * @param borrowid
     * @throws Exception
     */
    BorrowInfo selectBorrowInfoById(Integer borrowid) throws Exception;

}
