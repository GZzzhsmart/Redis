package com.ht.JasperReport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class JasperReportCompile {

    public static void main(String[] args) {
        try {
            String name = JasperCompileManager.compileReportToFile("src/main/resources/report1.jrxml"); // .jasper文件，文件名与jrxml的文件名一致
            System.out.println(name);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

}
