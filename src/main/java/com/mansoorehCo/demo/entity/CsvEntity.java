package com.mansoorehCo.demo.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;


@Entity
@Table(name = "tbl_csv")
public class CsvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String source;
    private String codeListCode;
    private Long code;
    private String displayValue;
    private String longDescription;
    private Data fromDate;
    private Data toDate;
    private int sortingPriority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCodeListCode() {
        return codeListCode;
    }

    public void setCodeListCode(String codeListCode) {
        this.codeListCode = codeListCode;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Data getFromDate() {
        return fromDate;
    }

    public void setFromDate(Data fromDate) {
        this.fromDate = fromDate;
    }

    public Data getToDate() {
        return toDate;
    }

    public void setToDate(Data toDate) {
        this.toDate = toDate;
    }

    public int getSortingPriority() {
        return sortingPriority;
    }

    public void setSortingPriority(int sortingPriority) {
        this.sortingPriority = sortingPriority;
    }
}
