package com.github.sbouclier.result;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Map;

/**
 * Result from getAssetInformation
 *
 * @author Stéphane Bouclier
 */
public class AssetInformationResult {

    private ArrayList<Object> error = new ArrayList<>();
    private Map<String, Result.AssetInformation> result;

    public ArrayList<Object> getError() {
        return error;
    }

    public Map<String, Result.AssetInformation> getResult() {
        return result;
    }

    public static class Result {

        private Map<String, AssetInformation> assets;

        public static class AssetInformation {
            @JsonProperty("altname")
            private String alternateName;

            @JsonProperty("aclass")
            private String assetClass;

            private Byte decimals;

            @JsonProperty("display_decimals")
            private Byte displayDecimals;

            public String getAlternateName() {
                return alternateName;
            }

            public void setAlternateName(String alternateName) {
                this.alternateName = alternateName;
            }

            public String getAssetClass() {
                return assetClass;
            }

            public void setAssetClass(String assetClass) {
                this.assetClass = assetClass;
            }

            public Byte getDecimals() {
                return decimals;
            }

            public void setDecimals(Byte decimals) {
                this.decimals = decimals;
            }

            public Byte getDisplayDecimals() {
                return displayDecimals;
            }

            public void setDisplayDecimals(Byte displayDecimals) {
                this.displayDecimals = displayDecimals;
            }

            @Override
            public String toString() {
                return "AssetInformation{" +
                        "alternateName='" + alternateName + '\'' +
                        ", assetClass='" + assetClass + '\'' +
                        ", decimals=" + decimals +
                        ", displayDecimals=" + displayDecimals +
                        '}';
            }
        }
    }
}
