package cz.fakturama.idoklad.model;

import java.util.Date;
import java.util.Map;

/**
 * Created by tatramat911 on 12.10.16.
 */
public class IssuedInvoiceItem {

    private int Id;
    private int InvoiceId;
    private String Code;
    private Date DateLastChange;
    private boolean IsRoundedItem;
    private boolean IsTaxMovement;
    private int ItemType;
    private double Price;
    private double PriceTotalWithoutVat;
    private double PriceTotalWithoutVatHc;
    private double PriceTotalWithVat;
    private double PriceTotalWithVatHc;
    private double PriceUnitVat;
    private double PriceUnitVatHc;
    private double PriceUnitWithoutVat;
    private double PriceUnitWithoutVatHc;
    private double PriceUnitWithVat;
    private double PriceUnitWithVatHc;
    private double TotalPrice;
    private double VatRate;
    private double VatTotal;
    private double VatTotalHc;
    private double Amount;
    private String Name;
    private int PriceListItemId;
    private int PriceType;
    private String Unit;
    private double UnitPrice;
    private int VatRateType;
    private Map<String, String> Links;

    public int getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        InvoiceId = invoiceId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Date getDateLastChange() {
        return DateLastChange;
    }

    public void setDateLastChange(Date dateLastChange) {
        DateLastChange = dateLastChange;
    }

    public boolean isRoundedItem() {
        return IsRoundedItem;
    }

    public void setRoundedItem(boolean roundedItem) {
        IsRoundedItem = roundedItem;
    }

    public boolean isTaxMovement() {
        return IsTaxMovement;
    }

    public void setTaxMovement(boolean taxMovement) {
        IsTaxMovement = taxMovement;
    }

    public int getItemType() {
        return ItemType;
    }

    public void setItemType(int itemType) {
        ItemType = itemType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPriceTotalWithoutVat() {
        return PriceTotalWithoutVat;
    }

    public void setPriceTotalWithoutVat(double priceTotalWithoutVat) {
        PriceTotalWithoutVat = priceTotalWithoutVat;
    }

    public double getPriceTotalWithoutVatHc() {
        return PriceTotalWithoutVatHc;
    }

    public void setPriceTotalWithoutVatHc(double priceTotalWithoutVatHc) {
        PriceTotalWithoutVatHc = priceTotalWithoutVatHc;
    }

    public double getPriceTotalWithVat() {
        return PriceTotalWithVat;
    }

    public void setPriceTotalWithVat(double priceTotalWithVat) {
        PriceTotalWithVat = priceTotalWithVat;
    }

    public double getPriceTotalWithVatHc() {
        return PriceTotalWithVatHc;
    }

    public void setPriceTotalWithVatHc(double priceTotalWithVatHc) {
        PriceTotalWithVatHc = priceTotalWithVatHc;
    }

    public double getPriceUnitVat() {
        return PriceUnitVat;
    }

    public void setPriceUnitVat(double priceUnitVat) {
        PriceUnitVat = priceUnitVat;
    }

    public double getPriceUnitVatHc() {
        return PriceUnitVatHc;
    }

    public void setPriceUnitVatHc(double priceUnitVatHc) {
        PriceUnitVatHc = priceUnitVatHc;
    }

    public double getPriceUnitWithoutVat() {
        return PriceUnitWithoutVat;
    }

    public void setPriceUnitWithoutVat(double priceUnitWithoutVat) {
        PriceUnitWithoutVat = priceUnitWithoutVat;
    }

    public double getPriceUnitWithoutVatHc() {
        return PriceUnitWithoutVatHc;
    }

    public void setPriceUnitWithoutVatHc(double priceUnitWithoutVatHc) {
        PriceUnitWithoutVatHc = priceUnitWithoutVatHc;
    }

    public double getPriceUnitWithVat() {
        return PriceUnitWithVat;
    }

    public void setPriceUnitWithVat(double priceUnitWithVat) {
        PriceUnitWithVat = priceUnitWithVat;
    }

    public double getPriceUnitWithVatHc() {
        return PriceUnitWithVatHc;
    }

    public void setPriceUnitWithVatHc(double priceUnitWithVatHc) {
        PriceUnitWithVatHc = priceUnitWithVatHc;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public double getVatRate() {
        return VatRate;
    }

    public void setVatRate(double vatRate) {
        VatRate = vatRate;
    }

    public double getVatTotal() {
        return VatTotal;
    }

    public void setVatTotal(double vatTotal) {
        VatTotal = vatTotal;
    }

    public double getVatTotalHc() {
        return VatTotalHc;
    }

    public void setVatTotalHc(double vatTotalHc) {
        VatTotalHc = vatTotalHc;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPriceListItemId() {
        return PriceListItemId;
    }

    public void setPriceListItemId(int priceListItemId) {
        PriceListItemId = priceListItemId;
    }

    public int getPriceType() {
        return PriceType;
    }

    public void setPriceType(int priceType) {
        PriceType = priceType;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getVatRateType() {
        return VatRateType;
    }

    public void setVatRateType(int vatRateType) {
        VatRateType = vatRateType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Map<String, String> getLinks() {
        return Links;
    }

    public void setLinks(Map<String, String> links) {
        Links = links;
    }
}
