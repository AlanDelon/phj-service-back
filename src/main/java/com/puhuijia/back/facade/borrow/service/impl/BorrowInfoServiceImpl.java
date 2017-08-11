package com.puhuijia.back.facade.borrow.service.impl;

import com.puhuijia.back.dao.borrow.mapper.BorrowInfoMapper;
import com.puhuijia.back.facade.borrow.service.IBorrowInfoService;
import com.puhuijia.commons.borrow.model.BorrowInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Copyright © JinNuoFeng Network Technology Co.,Ltd.</p>
 * Created by Alan on 2017/8/8.
 */
@Service
public class BorrowInfoServiceImpl implements IBorrowInfoService {

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

    @Override
    public JSONObject getBorrowInfo(Integer borrowId) throws Exception {
        BorrowInfo borrowInfo = borrowInfoMapper.selectBorrowInfoById(borrowId);
        return JSONObject.fromObject(borrowInfo);
    }
}
