package net.greg.examples.salient;

import java.io.Serializable;

public class SimpleModel implements Serializable {

    private String field1;
    private String field2;

    public SimpleModel(){}

  public SimpleModel(String fld1, String fld2){
    field1 = fld1;
    field2 = fld2;
  }

  public String getField1() { return field1; }
  public void setField1(String value) { field1 = value; }

  public String getField2() { return field2; }
  public void setField2(String value) { field2 = value; }

  public String toString(){
    return field1 + " " + field2 + "\n";
  }
}
