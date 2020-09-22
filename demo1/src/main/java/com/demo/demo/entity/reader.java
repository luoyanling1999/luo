package com.demo.demo.entity;


public class reader {
    private Integer R000;
    private String R01A;
    private String R01B;
    private String R01C;
    private String R01i;
    private String R01L;
    private String R01P;

    public Integer getR000() {
        return R000;
    }

    public void setR000(Integer r000) {
        R000 = r000;
    }

    public String getR01A() {
        return R01A;
    }

    public void setR01A(String r01A) {
        R01A = r01A;
    }

    public String getR01B() {
        return R01B;
    }

    public void setR01B(String r01B) {
        R01B = r01B;
    }

    public String getR01C() {
        return R01C;
    }

    public void setR01C(String r01C) {
        R01C = r01C;
    }

    public String getR01i() {
        return R01i;
    }

    public void setR01i(String r01i) {
        R01i = r01i;
    }

    public String getR01L() {
        return R01L;
    }

    public void setR01L(String r01L) {
        R01L = r01L;
    }

    public String getR01P() {
        return R01P;
    }

    public void setR01P(String r01P) {
        R01P = r01P;
    }

    @Override
    public String toString() {
        return "reader{" +
                "R000=" + R000 +
                ", R01A='" + R01A + '\'' +
                ", R01B='" + R01B + '\'' +
                ", R01C='" + R01C + '\'' +
                ", R01i='" + R01i + '\'' +
                ", R01L='" + R01L + '\'' +
                ", R01P='" + R01P + '\'' +
                '}';
    }
}
