package com.puhuijia.back;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.puhuijia.back.dao.borrow.mapper.BorrowInfoMapper;
import com.puhuijia.back.facade.borrow.service.IBorrowInfoService;
import com.puhuijia.commons.borrow.model.BorrowInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhjServiceBackApplicationTests {

    @Autowired
    private IBorrowInfoService borrowInfoService;

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

	@Test
	public void contextLoads() throws Exception {
        System.out.println("查询信息："+borrowInfoService.getBorrowInfo(1));
        BorrowInfo borrowInfo = new BorrowInfo();
        borrowInfo.setBianhao("320705195603074373");
        List<BorrowInfo> borrowInfoList = borrowInfoMapper.selectList(new EntityWrapper<BorrowInfo>(borrowInfo));
        for (BorrowInfo info : borrowInfoList) {
            System.out.println(info.getBorrowName());
        }
    }

}
