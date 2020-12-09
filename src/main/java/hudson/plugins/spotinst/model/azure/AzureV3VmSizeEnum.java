package hudson.plugins.spotinst.model.azure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum AzureV3VmSizeEnum {
    BASIC_A0("basic_a0",1),
    BASIC_A1("basic_a1",1),
    BASIC_A2("basic_a2",2),
    BASIC_A3("basic_a3",4),
    BASIC_A4("basic_a4",8),
    STANDARD_A0("standard_a0",1),
    STANDARD_A1("standard_a1",1),
    STANDARD_A1_V2("standard_a1_v2",1),
    STANDARD_A2("standard_a2",2),
    STANDARD_A2M_V2("standard_a2m_v2",2),
    STANDARD_A2_V2("standard_a2_v2",2),
    STANDARD_A3("standard_a3",4),
    STANDARD_A4("standard_a4",8),
    STANDARD_A4M_V2("standard_a4m_v2",4),
    STANDARD_A4_V2("standard_a4_v2",4),
    STANDARD_A5("standard_a5",2),
    STANDARD_A6("standard_a6",4),
    STANDARD_A7("standard_a7",8),
    STANDARD_A8M_V2("standard_a8m_v2",8),
    STANDARD_A8_V2("standard_a8_v2",8),
    STANDARD_B12MS("standard_b12ms",12),
    STANDARD_B16MS("standard_b16ms",16),
    STANDARD_B1LS("standard_b1ls",1),
    STANDARD_B1MS("standard_b1ms",1),
    STANDARD_B1S("standard_b1s",1),
    STANDARD_B20MS("standard_b20ms",20),
    STANDARD_B2MS("standard_b2ms",2),
    STANDARD_B2S("standard_b2s",2),
    STANDARD_B4MS("standard_b4ms",4),
    STANDARD_B8MS("standard_b8ms",8),
    STANDARD_D11_V2("standard_d11_v2",2),
    STANDARD_D12_V2("standard_d12_v2",4),
    STANDARD_D13_V2("standard_d13_v2",8),
    STANDARD_D14_V2("standard_d14_v2",16),
    STANDARD_D15I_V2("standard_d15i_v2",20),
    STANDARD_D15I_V2_1("standard_d15i_v2_1",20),
    STANDARD_D15_V2("standard_d15_v2",20),
    STANDARD_D16AS_V4("standard_d16as_v4",16),
    STANDARD_D16A_V4("standard_d16a_v4",16),
    STANDARD_D16DS_V4("standard_d16ds_v4",16),
    STANDARD_D16D_V4("standard_d16d_v4",16),
    STANDARD_D16S_V3("standard_d16s_v3",16),
    STANDARD_D16S_V4("standard_d16s_v4",16),
    STANDARD_D16_V3("standard_d16_v3",16),
    STANDARD_D16_V4("standard_d16_v4",16),
    STANDARD_D1_V2("standard_d1_v2",1),
    STANDARD_D2AS_V4("standard_d2as_v4",2),
    STANDARD_D2A_V4("standard_d2a_v4",2),
    STANDARD_D2DS_V4("standard_d2ds_v4",2),
    STANDARD_D2D_V4("standard_d2d_v4",2),
    STANDARD_D2S_V3("standard_d2s_v3",2),
    STANDARD_D2S_V4("standard_d2s_v4",2),
    STANDARD_D2_V2("standard_d2_v2",2),
    STANDARD_D2_V3("standard_d2_v3",2),
    STANDARD_D2_V4("standard_d2_v4",2),
    STANDARD_D32AS_V4("standard_d32as_v4",32),
    STANDARD_D32A_V4("standard_d32a_v4",32),
    STANDARD_D32DS_V4("standard_d32ds_v4",32),
    STANDARD_D32D_V4("standard_d32d_v4",32),
    STANDARD_D32S_V3("standard_d32s_v3",32),
    STANDARD_D32S_V4("standard_d32s_v4",32),
    STANDARD_D32_V3("standard_d32_v3",32),
    STANDARD_D32_V4("standard_d32_v4",32),
    STANDARD_D3_V2("standard_d3_v2",4),
    STANDARD_D48AS_V4("standard_d48as_v4",48),
    STANDARD_D48A_V4("standard_d48a_v4",48),
    STANDARD_D48DS_V4("standard_d48ds_v4",48),
    STANDARD_D48D_V4("standard_d48d_v4",48),
    STANDARD_D48S_V3("standard_d48s_v3",48),
    STANDARD_D48S_V4("standard_d48s_v4",48),
    STANDARD_D48_V3("standard_d48_v3",48),
    STANDARD_D48_V4("standard_d48_v4",48),
    STANDARD_D4AS_V4("standard_d4as_v4",4),
    STANDARD_D4A_V4("standard_d4a_v4",4),
    STANDARD_D4DS_V4("standard_d4ds_v4",4),
    STANDARD_D4D_V4("standard_d4d_v4",4),
    STANDARD_D4S_V3("standard_d4s_v3",4),
    STANDARD_D4S_V4("standard_d4s_v4",4),
    STANDARD_D4_V2("standard_d4_v2",8),
    STANDARD_D4_V3("standard_d4_v3",4),
    STANDARD_D4_V4("standard_d4_v4",4),
    STANDARD_D5_V2("standard_d5_v2",16),
    STANDARD_D64AS_V4("standard_d64as_v4",64),
    STANDARD_D64A_V4("standard_d64a_v4",64),
    STANDARD_D64DS_V4("standard_d64ds_v4",64),
    STANDARD_D64D_V4("standard_d64d_v4",64),
    STANDARD_D64S_V3("standard_d64s_v3",64),
    STANDARD_D64S_V4("standard_d64s_v4",64),
    STANDARD_D64_V3("standard_d64_v3",64),
    STANDARD_D64_V4("standard_d64_v4",64),
    STANDARD_D8AS_V4("standard_d8as_v4",8),
    STANDARD_D8A_V4("standard_d8a_v4",8),
    STANDARD_D8DS_V4("standard_d8ds_v4",8),
    STANDARD_D8D_V4("standard_d8d_v4",8),
    STANDARD_D8S_V3("standard_d8s_v3",8),
    STANDARD_D8S_V4("standard_d8s_v4",8),
    STANDARD_D8_V3("standard_d8_v3",8),
    STANDARD_D8_V4("standard_d8_v4",8),
    STANDARD_D96AS_V4("standard_d96as_v4",96),
    STANDARD_D96A_V4("standard_d96a_v4",96),
    STANDARD_DC1S_V2("standard_dc1s_v2",1),
    STANDARD_DC2S("standard_dc2s",2),
    STANDARD_DC2S_V2("standard_dc2s_v2",2),
    STANDARD_DC4S("standard_dc4s",4),
    STANDARD_DC4S_V2("standard_dc4s_v2",4),
    STANDARD_DC8S_V2("standard_dc8s_v2",16),
    STANDARD_DC8_V2("standard_dc8_v2",8),
    STANDARD_DS11_1_V2("standard_ds11-1_v2",1),
    STANDARD_DS11_V2("standard_ds11_v2",2),
    STANDARD_DS12_1_V2("standard_ds12-1_v2",1),
    STANDARD_DS12_2_V2("standard_ds12-2_v2",2),
    STANDARD_DS12_V2("standard_ds12_v2",4),
    STANDARD_DS13_2_V2("standard_ds13-2_v2",2),
    STANDARD_DS13_4_V2("standard_ds13-4_v2",4),
    STANDARD_DS13_V2("standard_ds13_v2",8),
    STANDARD_DS14_4_V2("standard_ds14-4_v2",4),
    STANDARD_DS14_8_V2("standard_ds14-8_v2",8),
    STANDARD_DS14_V2("standard_ds14_v2",16),
    STANDARD_DS15I_V2("standard_ds15i_v2",20),
    STANDARD_DS15I_V2_1("standard_ds15i_v2_1",20),
    STANDARD_DS15_V2("standard_ds15_v2",20),
    STANDARD_DS1_V2("standard_ds1_v2",1),
    STANDARD_DS2_V2("standard_ds2_v2",2),
    STANDARD_DS3_V2("standard_ds3_v2",4),
    STANDARD_DS4_V2("standard_ds4_v2",8),
    STANDARD_DS5_V2("standard_ds5_v2",16),
    STANDARD_E16_4AS_V4("standard_e16-4as_v4",4),
    STANDARD_E16_4DS_V4("standard_e16-4ds_v4",4),
    STANDARD_E16_4S_V3("standard_e16-4s_v3",4),
    STANDARD_E16_4S_V4("standard_e16-4s_v4",4),
    STANDARD_E16_8AS_V4("standard_e16-8as_v4",8),
    STANDARD_E16_8DS_V4("standard_e16-8ds_v4",8),
    STANDARD_E16_8S_V3("standard_e16-8s_v3",8),
    STANDARD_E16_8S_V4("standard_e16-8s_v4",8),
    STANDARD_E16AS_V4("standard_e16as_v4",16),
    STANDARD_E16A_V4("standard_e16a_v4",16),
    STANDARD_E16DS_V4("standard_e16ds_v4",16),
    STANDARD_E16D_V4("standard_e16d_v4",16),
    STANDARD_E16S_V3("standard_e16s_v3",16),
    STANDARD_E16S_V4("standard_e16s_v4",16),
    STANDARD_E16_V3("standard_e16_v3",16),
    STANDARD_E16_V4("standard_e16_v4",16),
    STANDARD_E20AS_V4("standard_e20as_v4",20),
    STANDARD_E20A_V4("standard_e20a_v4",20),
    STANDARD_E20DS_V4("standard_e20ds_v4",20),
    STANDARD_E20D_V4("standard_e20d_v4",20),
    STANDARD_E20S_V3("standard_e20s_v3",20),
    STANDARD_E20S_V4("standard_e20s_v4",20),
    STANDARD_E20_V3("standard_e20_v3",20),
    STANDARD_E2AS_V4("standard_e2as_v4",2),
    STANDARD_E2A_V4("standard_e2a_v4",2),
    STANDARD_E2DS_V4("standard_e2ds_v4",2),
    STANDARD_E2D_V4("standard_e2d_v4",2),
    STANDARD_E2S_V3("standard_e2s_v3",2),
    STANDARD_E2S_V4("standard_e2s_v4",2),
    STANDARD_E2_V3("standard_e2_v3",2),
    STANDARD_E2_V4("standard_e2_v4",2),
    STANDARD_E32_16AS_V4("standard_e32-16as_v4",16),
    STANDARD_E32_16DS_V4("standard_e32-16ds_v4",16),
    STANDARD_E32_16S_V3("standard_e32-16s_v3",16),
    STANDARD_E32_16S_V4("standard_e32-16s_v4",16),
    STANDARD_E32_8AS_V4("standard_e32-8as_v4",8),
    STANDARD_E32_8DS_V4("standard_e32-8ds_v4",8),
    STANDARD_E32_8S_V3("standard_e32-8s_v3",8),
    STANDARD_E32_8S_V4("standard_e32-8s_v4",8),
    STANDARD_E32AS_V4("standard_e32as_v4",32),
    STANDARD_E32A_V4("standard_e32a_v4",32),
    STANDARD_E32DS_V4("standard_e32ds_v4",32),
    STANDARD_E32D_V4("standard_e32d_v4",32),
    STANDARD_E32S_V3("standard_e32s_v3",32),
    STANDARD_E32S_V4("standard_e32s_v4",32),
    STANDARD_E32_V3("standard_e32_v3",32),
    STANDARD_E32_V4("standard_e32_v4",32),
    STANDARD_E4_2AS_V4("standard_e4-2as_v4",2),
    STANDARD_E4_2DS_V4("standard_e4-2ds_v4",2),
    STANDARD_E4_2S_V3("standard_e4-2s_v3",2),
    STANDARD_E4_2S_V4("standard_e4-2s_v4",2),
    STANDARD_E48AS_V4("standard_e48as_v4",48),
    STANDARD_E48A_V4("standard_e48a_v4",48),
    STANDARD_E48DS_V4("standard_e48ds_v4",48),
    STANDARD_E48D_V4("standard_e48d_v4",48),
    STANDARD_E48S_V3("standard_e48s_v3",48),
    STANDARD_E48S_V4("standard_e48s_v4",48),
    STANDARD_E48_V3("standard_e48_v3",48),
    STANDARD_E48_V4("standard_e48_v4",48),
    STANDARD_E4AS_V4("standard_e4as_v4",4),
    STANDARD_E4A_V4("standard_e4a_v4",4),
    STANDARD_E4DS_V4("standard_e4ds_v4",4),
    STANDARD_E4D_V4("standard_e4d_v4",4),
    STANDARD_E4S_V3("standard_e4s_v3",4),
    STANDARD_E4S_V4("standard_e4s_v4",4),
    STANDARD_E4_V3("standard_e4_v3",4),
    STANDARD_E4_V4("standard_e4_v4",4),
    STANDARD_E64_16AS_V4("standard_e64-16as_v4",16),
    STANDARD_E64_16DS_V4("standard_e64-16ds_v4",16),
    STANDARD_E64_16S_V3("standard_e64-16s_v3",16),
    STANDARD_E64_16S_V4("standard_e64-16s_v4",16),
    STANDARD_E64_32AS_V4("standard_e64-32as_v4",32),
    STANDARD_E64_32DS_V4("standard_e64-32ds_v4",32),
    STANDARD_E64_32S_V3("standard_e64-32s_v3",32),
    STANDARD_E64_32S_V4("standard_e64-32s_v4",32),
    STANDARD_E64AS_V4("standard_e64as_v4",64),
    STANDARD_E64A_V4("standard_e64a_v4",64),
    STANDARD_E64DS_V4("standard_e64ds_v4",64),
    STANDARD_E64D_V4("standard_e64d_v4",64),
    STANDARD_E64IS_V3("standard_e64is_v3",64),
    STANDARD_E64IS_V3_1("standard_e64is_v3_1",64),
    STANDARD_E64I_V3("standard_e64i_v3",64),
    STANDARD_E64I_V3_1("standard_e64i_v3_1",64),
    STANDARD_E64S_V3("standard_e64s_v3",64),
    STANDARD_E64S_V4("standard_e64s_v4",64),
    STANDARD_E64_V3("standard_e64_v3",64),
    STANDARD_E64_V4("standard_e64_v4",64),
    STANDARD_E8_2AS_V4("standard_e8-2as_v4",2),
    STANDARD_E8_2DS_V4("standard_e8-2ds_v4",2),
    STANDARD_E8_2S_V3("standard_e8-2s_v3",2),
    STANDARD_E8_2S_V4("standard_e8-2s_v4",2),
    STANDARD_E8_4AS_V4("standard_e8-4as_v4",4),
    STANDARD_E8_4DS_V4("standard_e8-4ds_v4",4),
    STANDARD_E8_4S_V3("standard_e8-4s_v3",4),
    STANDARD_E8_4S_V4("standard_e8-4s_v4",4),
    STANDARD_E80_IDS_V4("standard_e80-ids_v4",80),
    STANDARD_E80_IS_V4("standard_e80-is_v4",80),
    STANDARD_E8AS_V4("standard_e8as_v4",8),
    STANDARD_E8A_V4("standard_e8a_v4",8),
    STANDARD_E8DS_V4("standard_e8ds_v4",8),
    STANDARD_E8D_V4("standard_e8d_v4",8),
    STANDARD_E8S_V3("standard_e8s_v3",8),
    STANDARD_E8S_V4("standard_e8s_v4",8),
    STANDARD_E8_V3("standard_e8_v3",8),
    STANDARD_E8_V4("standard_e8_v4",8),
    STANDARD_E96_24AS_V4("standard_e96-24as_v4",24),
    STANDARD_E96_48AS_V4("standard_e96-48as_v4",48),
    STANDARD_E96AS_V4("standard_e96as_v4",96),
    STANDARD_E96A_V4("standard_e96a_v4",96),
    STANDARD_F1("standard_f1",1),
    STANDARD_F16("standard_f16",16),
    STANDARD_F16S("standard_f16s",16),
    STANDARD_F16S_V2("standard_f16s_v2",16),
    STANDARD_F1S("standard_f1s",1),
    STANDARD_F2("standard_f2",2),
    STANDARD_F2S("standard_f2s",2),
    STANDARD_F2S_V2("standard_f2s_v2",2),
    STANDARD_F32S_V2("standard_f32s_v2",32),
    STANDARD_F4("standard_f4",4),
    STANDARD_F48S_V2("standard_f48s_v2",48),
    STANDARD_F4S("standard_f4s",4),
    STANDARD_F4S_V2("standard_f4s_v2",4),
    STANDARD_F64S_V2("standard_f64s_v2",64),
    STANDARD_F72S_V2("standard_f72s_v2",72),
    STANDARD_F8("standard_f8",8),
    STANDARD_F8S("standard_f8s",8),
    STANDARD_F8S_V2("standard_f8s_v2",8),
    STANDARD_G1("standard_g1",2),
    STANDARD_G2("standard_g2",4),
    STANDARD_G3("standard_g3",8),
    STANDARD_G4("standard_g4",16),
    STANDARD_G5("standard_g5",32),
    STANDARD_GS1("standard_gs1",2),
    STANDARD_GS2("standard_gs2",4),
    STANDARD_GS3("standard_gs3",8),
    STANDARD_GS4("standard_gs4",16),
    STANDARD_GS4_4("standard_gs4-4",4),
    STANDARD_GS4_8("standard_gs4-8",8),
    STANDARD_GS5("standard_gs5",32),
    STANDARD_GS5_16("standard_gs5-16",16),
    STANDARD_GS5_8("standard_gs5-8",8),
    STANDARD_H16("standard_h16",16),
    STANDARD_H16M("standard_h16m",16),
    STANDARD_H16MR("standard_h16mr",16),
    STANDARD_H16MR_PROMO("standard_h16mr_promo",16),
    STANDARD_H16M_PROMO("standard_h16m_promo",16),
    STANDARD_H16R("standard_h16r",16),
    STANDARD_H16R_PROMO("standard_h16r_promo",16),
    STANDARD_H16_PROMO("standard_h16_promo",16),
    STANDARD_H8("standard_h8",8),
    STANDARD_H8M("standard_h8m",8),
    STANDARD_H8M_PROMO("standard_h8m_promo",8),
    STANDARD_H8_PROMO("standard_h8_promo",8),
    STANDARD_HB120RS_V2("standard_hb120rs_v2",120),
    STANDARD_HB60RS("standard_hb60rs",60),
    STANDARD_HC44RS("standard_hc44rs",44),
    STANDARD_L16S("standard_l16s",16),
    STANDARD_L16S_V2("standard_l16s_v2",16),
    STANDARD_L32S("standard_l32s",32),
    STANDARD_L32S_V2("standard_l32s_v2",32),
    STANDARD_L48S_V2("standard_l48s_v2",48),
    STANDARD_L4S("standard_l4s",4),
    STANDARD_L64S_V2("standard_l64s_v2",64),
    STANDARD_L80S_V2("standard_l80s_v2",80),
    STANDARD_L8S("standard_l8s",8),
    STANDARD_L8S_V2("standard_l8s_v2",8),
    STANDARD_M128("standard_m128",128),
    STANDARD_M128_32MS("standard_m128-32ms",32),
    STANDARD_M128_64MS("standard_m128-64ms",64),
    STANDARD_M128M("standard_m128m",128),
    STANDARD_M128MS("standard_m128ms",128),
    STANDARD_M128M_1("standard_m128m_1",128),
    STANDARD_M128S("standard_m128s",128),
    STANDARD_M128_1("standard_m128_1",128),
    STANDARD_M16_4MS("standard_m16-4ms",4),
    STANDARD_M16_8MS("standard_m16-8ms",8),
    STANDARD_M16MS("standard_m16ms",16),
    STANDARD_M208MS_V2("standard_m208ms_v2",208),
    STANDARD_M208S_V2("standard_m208s_v2",208),
    STANDARD_M32_16MS("standard_m32-16ms",32),
    STANDARD_M32_8MS("standard_m32-8ms",32),
    STANDARD_M32LS("standard_m32ls",32),
    STANDARD_M32MS("standard_m32ms",32),
    STANDARD_M32TS("standard_m32ts",32),
    STANDARD_M416MS_V2("standard_m416ms_v2",416),
    STANDARD_M416S_V2("standard_m416s_v2",416),
    STANDARD_M64("standard_m64",64),
    STANDARD_M64_16MS("standard_m64-16ms",16),
    STANDARD_M64_32MS("standard_m64-32ms",32),
    STANDARD_M64LS("standard_m64ls",64),
    STANDARD_M64M("standard_m64m",64),
    STANDARD_M64MS("standard_m64ms",64),
    STANDARD_M64M_1("standard_m64m_1",64),
    STANDARD_M64S("standard_m64s",64),
    STANDARD_M64_1("standard_m64_1",64),
    STANDARD_M8_2MS("standard_m8-2ms",8),
    STANDARD_M8_4MS("standard_m8-4ms",8),
    STANDARD_M8MS("standard_m8ms",8),
    STANDARD_NC12("standard_nc12",12),
    STANDARD_NC12S_V2("standard_nc12s_v2",12),
    STANDARD_NC12S_V3("standard_nc12s_v3",12),
    STANDARD_NC12_PROMO("standard_nc12_promo",12),
    STANDARD_NC24("standard_nc24",24),
    STANDARD_NC24R("standard_nc24r",24),
    STANDARD_NC24RS_V2("standard_nc24rs_v2",24),
    STANDARD_NC24RS_V3("standard_nc24rs_v3",24),
    STANDARD_NC24R_PROMO("standard_nc24r_promo",24),
    STANDARD_NC24S_V2("standard_nc24s_v2",24),
    STANDARD_NC24S_V3("standard_nc24s_v3",24),
    STANDARD_NC24_PROMO("standard_nc24_promo",24),
    STANDARD_NC6("standard_nc6",6),
    STANDARD_NC6S_V2("standard_nc6s_v2",6),
    STANDARD_NC6S_V3("standard_nc6s_v3",6),
    STANDARD_NC6_PROMO("standard_nc6_promo",6),
    STANDARD_ND12S("standard_nd12s",12),
    STANDARD_ND24RS("standard_nd24rs",24),
    STANDARD_ND24S("standard_nd24s",24),
    STANDARD_ND40RS_V2("standard_nd40rs_v2",40),
    STANDARD_ND6S("standard_nd6s",6),
    STANDARD_NV12("standard_nv12",12),
    STANDARD_NV12S_V3("standard_nv12s_v3",12),
    STANDARD_NV12_PROMO("standard_nv12_promo",12),
    STANDARD_NV16AS_V4("standard_nv16as_v4",16),
    STANDARD_NV24("standard_nv24",24),
    STANDARD_NV24S_V3("standard_nv24s_v3",24),
    STANDARD_NV24_PROMO("standard_nv24_promo",24),
    STANDARD_NV32AS_V4("standard_nv32as_v4",32),
    STANDARD_NV48S_V3("standard_nv48s_v3",48),
    STANDARD_NV4AS_V4("standard_nv4as_v4",4),
    STANDARD_NV6("standard_nv6",6),
    STANDARD_NV6_PROMO("standard_nv6_promo",6),
    STANDARD_NV8AS_V4("standard_nv8as_v4",8);

    private      String  value;
    private              Integer executors;
    private static final Logger  LOGGER = LoggerFactory.getLogger(AzureV3VmSizeEnum.class);

    private AzureV3VmSizeEnum(String value, Integer executors) {
        this.value = value;
        this.executors = executors;
    }

    public String toString() {
        return this.value;
    }

    public Integer getExecutors() {
        return executors;
    }

    public static AzureV3VmSizeEnum fromValue(String value) {
        AzureV3VmSizeEnum retVal = null;
        for (AzureV3VmSizeEnum vmSize : AzureV3VmSizeEnum.values()) {
            if (vmSize.value.equalsIgnoreCase(value)) {
                retVal = vmSize;
                break;
            }
        }

        if (retVal == null) {
            LOGGER.error("Tried to create Azure V3 Size Enum for: " + value + " but we don't support such type ");
        }

        return retVal;
    }

    public String getValue() {
        return value;
    }

}
