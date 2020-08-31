package cn.sz.twoOfGroup.entity;

import java.io.Serializable;

/**
 * (StsMarket)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:26:53
 */
public class StsMarket implements Serializable {
    private static final long serialVersionUID = 180182616361434566L;
    /**
     * 主键id
     */
    private Integer marketId;
    /**
     * 股票代码
     */
    private String detailCode;
    /**
     * 股票名称
     */
    private String detailName;
    /**
     * 现价
     */
    private Double marketMaprice;
    /**
     * 涨跌幅度
     */
    private Double marketDzf;
    /**
     * 涨跌价格
     */
    private Double marketZd;
    /**
     * 涨速
     */
    private Double marketZs;
    /**
     * 换手
     */
    private Double marketHs;
    /**
     * 量比
     */
    private Double marketLb;
    /**
     * 振幅
     */
    private Double marketZf;
    /**
     * 成交量
     */
    private Double marketCjl;
    /**
     * 成交额（单位/亿）
     */
    private Double marketCje;
    /**
     * 流通股（单位/万）
     */
    private Double marketLtg;
    /**
     * 流通市值（单位/亿）
     */
    private Double marketLtsz;
    /**
     * 市盈率
     */
    private Double marketSyl;
    /**
     * 今开(今日开盘价)
     */
    private Double marketStart;
    /**
     * 最高
     */
    private Double marketHeight;
    /**
     * 最低
     */
    private Double marketLow;
    /**
     * 总市值
     */
    private Double markerZsj;
    /**
     * 昨日收
     */
    private Double marketZrs;
    /**
     * 市净率
     */
    private Double marketSjl;
    /**
     * 是否盈利1--是，0--否）
     */
    private Integer marketSfyl;
    /**
     * 同股同权（1--是，0--否）
     */
    private Integer marketTgtq;
    /**
     * 交易状态（1--开市，0--闭市）
     */
    private Integer marketStats;


    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Double getMarketMaprice() {
        return marketMaprice;
    }

    public void setMarketMaprice(Double marketMaprice) {
        this.marketMaprice = marketMaprice;
    }

    public Double getMarketDzf() {
        return marketDzf;
    }

    public void setMarketDzf(Double marketDzf) {
        this.marketDzf = marketDzf;
    }

    public Double getMarketZd() {
        return marketZd;
    }

    public void setMarketZd(Double marketZd) {
        this.marketZd = marketZd;
    }

    public Double getMarketZs() {
        return marketZs;
    }

    public void setMarketZs(Double marketZs) {
        this.marketZs = marketZs;
    }

    public Double getMarketHs() {
        return marketHs;
    }

    public void setMarketHs(Double marketHs) {
        this.marketHs = marketHs;
    }

    public Double getMarketLb() {
        return marketLb;
    }

    public void setMarketLb(Double marketLb) {
        this.marketLb = marketLb;
    }

    public Double getMarketZf() {
        return marketZf;
    }

    public void setMarketZf(Double marketZf) {
        this.marketZf = marketZf;
    }

    public Double getMarketCjl() {
        return marketCjl;
    }

    public void setMarketCjl(Double marketCjl) {
        this.marketCjl = marketCjl;
    }

    public Double getMarketCje() {
        return marketCje;
    }

    public void setMarketCje(Double marketCje) {
        this.marketCje = marketCje;
    }

    public Double getMarketLtg() {
        return marketLtg;
    }

    public void setMarketLtg(Double marketLtg) {
        this.marketLtg = marketLtg;
    }

    public Double getMarketLtsz() {
        return marketLtsz;
    }

    public void setMarketLtsz(Double marketLtsz) {
        this.marketLtsz = marketLtsz;
    }

    public Double getMarketSyl() {
        return marketSyl;
    }

    public void setMarketSyl(Double marketSyl) {
        this.marketSyl = marketSyl;
    }

    public Double getMarketStart() {
        return marketStart;
    }

    public void setMarketStart(Double marketStart) {
        this.marketStart = marketStart;
    }

    public Double getMarketHeight() {
        return marketHeight;
    }

    public void setMarketHeight(Double marketHeight) {
        this.marketHeight = marketHeight;
    }

    public Double getMarketLow() {
        return marketLow;
    }

    public void setMarketLow(Double marketLow) {
        this.marketLow = marketLow;
    }

    public Double getMarkerZsj() {
        return markerZsj;
    }

    public void setMarkerZsj(Double markerZsj) {
        this.markerZsj = markerZsj;
    }

    public Double getMarketZrs() {
        return marketZrs;
    }

    public void setMarketZrs(Double marketZrs) {
        this.marketZrs = marketZrs;
    }

    public Double getMarketSjl() {
        return marketSjl;
    }

    public void setMarketSjl(Double marketSjl) {
        this.marketSjl = marketSjl;
    }

    public Integer getMarketSfyl() {
        return marketSfyl;
    }

    public void setMarketSfyl(Integer marketSfyl) {
        this.marketSfyl = marketSfyl;
    }

    public Integer getMarketTgtq() {
        return marketTgtq;
    }

    public void setMarketTgtq(Integer marketTgtq) {
        this.marketTgtq = marketTgtq;
    }

    public Integer getMarketStats() {
        return marketStats;
    }

    public void setMarketStats(Integer marketStats) {
        this.marketStats = marketStats;
    }

}