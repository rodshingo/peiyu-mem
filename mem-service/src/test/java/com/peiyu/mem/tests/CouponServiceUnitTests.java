package com.peiyu.mem.tests;

import com.peiyu.mem.domian.entity.GoodsForCoupon;
import com.peiyu.mem.service.CouponService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-service-test.xml"})
public class CouponServiceUnitTests {
    @Autowired
    private CouponService couponService;
    @Test
    public void testConsumeSendCoupon() {
        List<GoodsForCoupon> goodsForCoupons = new ArrayList<>();
        for (int i=0;i<=9;i++){
            GoodsForCoupon goodsForCoupon = new GoodsForCoupon();
            goodsForCoupon.setVendorId(1483l);
            goodsForCoupon.setMemNo("123456789");
            goodsForCoupon.setFirstBrandCode("1");
            goodsForCoupon.setSecondBrandCode("2");
            goodsForCoupon.setThirdBrandCode("3");
            goodsForCoupon.setFirstIcatCode("11");
            goodsForCoupon.setSecondIcatCode("12");
            goodsForCoupon.setThirdIcatCode("13");
            goodsForCoupon.setFourthIcatCode("14");
            goodsForCoupon.setMoney(30d);
            goodsForCoupon.setRealPayMoney(300d);
            goodsForCoupon.setSkuCode("21");
            goodsForCoupon.setStoreCode("22");
            goodsForCoupon.setOrganCode("23");
            goodsForCoupon.setSupplierCode("24");
            goodsForCoupons.add(goodsForCoupon);
        }
        int result = couponService.consumeSendCoupon(goodsForCoupons);
        Assert.assertEquals(0,result);
    }
}