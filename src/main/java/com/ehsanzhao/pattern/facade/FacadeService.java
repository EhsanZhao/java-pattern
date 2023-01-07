package com.ehsanzhao.pattern.facade;

/**
 * @author zhaoyuan
 * @date 2023/1/7
 */
public class FacadeService {

    public void getByAProductInfo(){
        ProductSystemService productSystemService = new ProductSystemService();
        OrderSystemService orderSystemService = new OrderSystemService();
        orderSystemService.createOrder(productSystemService.getAProduct());
        PaymentSystemService paymentSystemService = new PaymentSystemService();
        paymentSystemService.pay();
        WaybillSystemService waybillSystemService = new WaybillSystemService();
        waybillSystemService.creatWaybill();
    }
}
