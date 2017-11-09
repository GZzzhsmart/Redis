package com.ht.JasperReport;

import com.ht.bean.Sale;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.*;

public class JasperReportCompile {

    public static void main(String[] args) {
        try {
            // 第二步：把jrxml文档编译成jasper文档
            String jasperName = JasperCompileManager.compileReportToFile("src/main/resources/report1.jrxml");
            System.out.println(jasperName);
            //第三步：获取填充报表的数据，数据库
            List<Sale> saleList = getSaleList();
            //第四步：组装报表数据源
            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(saleList);
            //第五步：填充报表
            Map<String,Object> params = new HashMap <String, Object>();
            String printName = JasperFillManager.fillReportToFile("src/main/resources/report1.jasper",params,beanCollectionDataSource);
            System.out.println(printName);
            //第六步：打印或导出报表
//            JasperPrintManager.printReport(printName,true);
            JasperExportManager.exportReportToPdfFile(printName);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    private static List<Sale> getSaleList(){
        List<Sale> saleList = new ArrayList <Sale>();
        saleList.add(new Sale(1,1,100));
        saleList.add(new Sale(2,2,120));
        saleList.add(new Sale(3,3,150));
        return saleList;
    }

}
