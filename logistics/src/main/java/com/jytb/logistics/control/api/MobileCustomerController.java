package com.jytb.logistics.control.api;

import co.chexiao.base.contract.enums.common.ResultEnum;
import co.chexiao.common.util.StringUtil;
import com.jytb.logistics.bean.customer.Customer;
import com.jytb.logistics.bean.vo.CustomerVO;
import com.jytb.logistics.interceptor.TokenCheck;
import com.jytb.logistics.service.customer.ICustomerService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
<<<<<<< HEAD
 * Created by fulei on 2017/2/16.
=======
 * @author zqy
 * @date 2020/09/26
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
 */
@Controller
@RequestMapping("api/customer")
public class MobileCustomerController {

    private static final Logger logger = LoggerFactory.getLogger(MobileCustomerController.class);

    @Autowired
    private ICustomerService customerService;


    /**
<<<<<<< HEAD
     * 查询物流单列表
=======
     * 查询客户
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "getCustomer", produces = "text/html;charset=UTF-8")
    @ResponseBody
    @TokenCheck
<<<<<<< HEAD
    public String getCustomer(HttpServletRequest request) {
=======
    public String list(HttpServletRequest request) {
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
        JSONObject resultObj = new JSONObject();
        JSONObject data = new JSONObject();
        CustomerVO customerVO = new CustomerVO();
        try {
            String condition = getCondition(request);
<<<<<<< HEAD
            List<Customer> customerList = customerService.getCustomerListPageByCondition(condition, 1, 1, "id desc");
=======
            List<Customer> customerList = customerService.getCustomerListPageByCondition(condition, 1, 1, "id");
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
            if (customerList != null && customerList.size() > 0) {
                customerVO = new CustomerVO(customerList.get(0));
            }
            resultObj.put("result", ResultEnum.SUCCESS.getCode());
            data.put("customer", customerVO);
            data.put("code", ResultEnum.SUCCESS.getCode());
            resultObj.put("data", data);
        } catch (Exception e) {
<<<<<<< HEAD
            logger.error("app查询客户错误", e);
            resultObj.put("result", ResultEnum.ERROR.getCode());
            resultObj.put("errormsg", ResultEnum.ERROR.getDesc());
        }
        logger.info("app查询客户返回参数：" + resultObj.toString());
=======
            logger.error("app查询客户信息错误", e);
            resultObj.put("result", ResultEnum.ERROR.getCode());
            resultObj.put("errormsg", ResultEnum.ERROR.getDesc());
        }
        logger.info("app查询客户信息返回参数：" + resultObj.toString());
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
        return resultObj.toString();
    }

    private String getCondition(HttpServletRequest request) {
<<<<<<< HEAD
        StringBuilder condition = new StringBuilder("1=1");
=======
        StringBuilder condition = new StringBuilder("");
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
        String systemNum = StringUtil.g(request.getParameter("systemNum"));
        String customerName = StringUtil.g(request.getParameter("customerName"));
        String customerShopName = StringUtil.g(request.getParameter("customerShopName"));
        String phoneNum = StringUtil.g(request.getParameter("phoneNum"));
        String address = StringUtil.g(request.getParameter("address"));
        String remark = StringUtil.g(request.getParameter("remark"));
        String userId = StringUtil.g(request.getParameter("userId"));

        if (!StringUtil.isEmpty(systemNum)) {
            condition.append(" AND system_num = '").append(systemNum).append("' ");
        }

        if (!StringUtil.isEmpty(customerName)) {
<<<<<<< HEAD
            condition.append(" AND customer_name = '").append(customerName).append("' ");
=======
            condition.append(" AND customer_name like = '").append(customerName).append("' ");
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
        }

        if (!StringUtil.isEmpty(customerShopName)) {
            condition.append(" AND customer_shop_name = '").append(customerShopName).append("' ");
        }

        if (!StringUtil.isEmpty(address)) {
            condition.append(" AND address = '").append(address).append("' ");
        }

        if (!StringUtil.isEmpty(remark)) {
            condition.append(" AND remark like '%").append(remark).append("%' ");
        }

        if (!StringUtil.isEmpty(phoneNum)) {
            condition.append(" AND phone_num = '").append(phoneNum).append("' ");
        }

<<<<<<< HEAD
        if (!StringUtil.isEmpty(userId)&& !"0".equals(userId)) {
=======
        if (!StringUtil.isEmpty(userId)) {
>>>>>>> cc45cc578d9c54cc28906b328848b1934f487dc7
            condition.append(" AND user_id = ").append(userId).append(" ");
        }

        return condition.toString();
    }

}
