package com.hoodps.demo.controller;

import com.hoodps.demo.VO.ProductInfoVO;
import com.hoodps.demo.VO.ProductVO;
import com.hoodps.demo.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setData(productVO);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
