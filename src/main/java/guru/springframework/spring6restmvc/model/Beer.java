package guru.springframework.spring6restmvc.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Beer {
    private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    Beer(UUID id, Integer version, String beerName, BeerStyle beerStyle, String upc, Integer quantityOnHand, BigDecimal price, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.version = version;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public static BeerBuilder builder() {
        return new BeerBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public BeerStyle getBeerStyle() {
        return this.beerStyle;
    }

    public String getUpc() {
        return this.upc;
    }

    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setBeerStyle(BeerStyle beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Beer)) return false;
        final Beer other = (Beer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$beerName = this.getBeerName();
        final Object other$beerName = other.getBeerName();
        if (this$beerName == null ? other$beerName != null : !this$beerName.equals(other$beerName)) return false;
        final Object this$beerStyle = this.getBeerStyle();
        final Object other$beerStyle = other.getBeerStyle();
        if (this$beerStyle == null ? other$beerStyle != null : !this$beerStyle.equals(other$beerStyle)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$quantityOnHand = this.getQuantityOnHand();
        final Object other$quantityOnHand = other.getQuantityOnHand();
        if (this$quantityOnHand == null ? other$quantityOnHand != null : !this$quantityOnHand.equals(other$quantityOnHand))
            return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$createDate = this.getCreateDate();
        final Object other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate))
            return false;
        final Object this$updateDate = this.getUpdateDate();
        final Object other$updateDate = other.getUpdateDate();
        if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Beer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $beerName = this.getBeerName();
        result = result * PRIME + ($beerName == null ? 43 : $beerName.hashCode());
        final Object $beerStyle = this.getBeerStyle();
        result = result * PRIME + ($beerStyle == null ? 43 : $beerStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $quantityOnHand = this.getQuantityOnHand();
        result = result * PRIME + ($quantityOnHand == null ? 43 : $quantityOnHand.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $createDate = this.getCreateDate();
        result = result * PRIME + ($createDate == null ? 43 : $createDate.hashCode());
        final Object $updateDate = this.getUpdateDate();
        result = result * PRIME + ($updateDate == null ? 43 : $updateDate.hashCode());
        return result;
    }

    public String toString() {
        return "Beer(id=" + this.getId() + ", version=" + this.getVersion() + ", beerName=" + this.getBeerName() + ", beerStyle=" + this.getBeerStyle() + ", upc=" + this.getUpc() + ", quantityOnHand=" + this.getQuantityOnHand() + ", price=" + this.getPrice() + ", createDate=" + this.getCreateDate() + ", updateDate=" + this.getUpdateDate() + ")";
    }

    public static class BeerBuilder {
        private UUID id;
        private Integer version;
        private String beerName;
        private BeerStyle beerStyle;
        private String upc;
        private Integer quantityOnHand;
        private BigDecimal price;
        private LocalDateTime createDate;
        private LocalDateTime updateDate;

        BeerBuilder() {
        }

        public BeerBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public BeerBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerBuilder beerStyle(BeerStyle beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerBuilder upc(String upc) {
            this.upc = upc;
            return this;
        }

        public BeerBuilder quantityOnHand(Integer quantityOnHand) {
            this.quantityOnHand = quantityOnHand;
            return this;
        }

        public BeerBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public BeerBuilder createDate(LocalDateTime createDate) {
            this.createDate = createDate;
            return this;
        }

        public BeerBuilder updateDate(LocalDateTime updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public Beer build() {
            return new Beer(this.id, this.version, this.beerName, this.beerStyle, this.upc, this.quantityOnHand, this.price, this.createDate, this.updateDate);
        }

        public String toString() {
            return "Beer.BeerBuilder(id=" + this.id + ", version=" + this.version + ", beerName=" + this.beerName + ", beerStyle=" + this.beerStyle + ", upc=" + this.upc + ", quantityOnHand=" + this.quantityOnHand + ", price=" + this.price + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ")";
        }
    }
}
