package org.gittner.osmbugs.osmose

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.gittner.osmbugs.Error
import org.gittner.osmbugs.R
import org.gittner.osmbugs.statics.OpenStreetMap
import org.joda.time.DateTime
import org.osmdroid.api.IGeoPoint

@Entity
data class OsmoseError(
    override val Point: IGeoPoint,
    @PrimaryKey val Id: Long,
    val Type: ERROR_TYPE,
    val CreationDate: DateTime,
    val Title: String,
    val SubTitle: String
) : Error(Point) {

    var Elements = ArrayList<OpenStreetMap.Object>()

    @Suppress("EnumEntryName")
    enum class ERROR_TYPE(
        val Item: Int,
        val Drawable: Int,
        val DescriptionId: Int
    ) {
        _0(0, R.drawable.osmose_marker_b_0, R.string.osmose_error_description_0),
        _1(1, R.drawable.osmose_marker_b_1, R.string.osmose_error_description_1),
        _1010(1010, R.drawable.osmose_marker_b_1010, R.string.osmose_error_description_1010),
        _1040(1040, R.drawable.osmose_marker_b_1040, R.string.osmose_error_description_1040),
        _1050(1050, R.drawable.osmose_marker_b_1050, R.string.osmose_error_description_1050),
        _1060(1060, R.drawable.osmose_marker_b_1060, R.string.osmose_error_description_1060),
        _1070(1070, R.drawable.osmose_marker_b_1070, R.string.osmose_error_description_1070),
        _1080(1080, R.drawable.osmose_marker_b_1080, R.string.osmose_error_description_1080),
        _1090(1090, R.drawable.osmose_marker_b_1090, R.string.osmose_error_description_1090),
        _1100(1100, R.drawable.osmose_marker_b_1100, R.string.osmose_error_description_1100),
        _1110(1110, R.drawable.osmose_marker_b_1110, R.string.osmose_error_description_1110),
        _1120(1120, R.drawable.osmose_marker_b_1120, R.string.osmose_error_description_1120),
        _1140(1140, R.drawable.osmose_marker_b_1140, R.string.osmose_error_description_1140),
        _1150(1150, R.drawable.osmose_marker_b_1150, R.string.osmose_error_description_1150),
        _1160(1160, R.drawable.osmose_marker_b_1160, R.string.osmose_error_description_1160),
        _1170(1170, R.drawable.osmose_marker_b_1170, R.string.osmose_error_description_1170),
        _1180(1180, R.drawable.osmose_marker_b_1180, R.string.osmose_error_description_1180),
        _1190(1190, R.drawable.osmose_marker_b_1190, R.string.osmose_error_description_1190),
        _1200(1200, R.drawable.osmose_marker_b_1200, R.string.osmose_error_description_1200),
        _1210(1210, R.drawable.osmose_marker_b_1210, R.string.osmose_error_description_1210),
        _1220(1220, R.drawable.osmose_marker_b_1220, R.string.osmose_error_description_1220),
        _1221(1221, R.drawable.osmose_marker_b_1221, R.string.osmose_error_description_1221),
        _1230(1230, R.drawable.osmose_marker_b_1230, R.string.osmose_error_description_1230),
        _1240(1240, R.drawable.osmose_marker_b_1240, R.string.osmose_error_description_1240),
        _1250(1250, R.drawable.osmose_marker_b_1250, R.string.osmose_error_description_1250),
        _1260(1260, R.drawable.osmose_marker_b_1260, R.string.osmose_error_description_1260),
        _1270(1270, R.drawable.osmose_marker_b_1270, R.string.osmose_error_description_1270),
        _1280(1280, R.drawable.osmose_marker_b_1280, R.string.osmose_error_description_1280),
        _1290(1290, R.drawable.osmose_marker_b_1290, R.string.osmose_error_description_1290),
        _2010(2010, R.drawable.osmose_marker_b_2010, R.string.osmose_error_description_2010),
        _2020(2020, R.drawable.osmose_marker_b_2020, R.string.osmose_error_description_2020),
        _2030(2030, R.drawable.osmose_marker_b_2030, R.string.osmose_error_description_2030),
        _2040(2040, R.drawable.osmose_marker_b_2040, R.string.osmose_error_description_2040),
        _2060(2060, R.drawable.osmose_marker_b_2060, R.string.osmose_error_description_2060),
        _2080(2080, R.drawable.osmose_marker_b_2080, R.string.osmose_error_description_2080),
        _2090(2090, R.drawable.osmose_marker_b_2090, R.string.osmose_error_description_2090),
        _2100(2100, R.drawable.osmose_marker_b_2100, R.string.osmose_error_description_2100),
        _2110(2110, R.drawable.osmose_marker_b_2110, R.string.osmose_error_description_2110),
        _2120(2120, R.drawable.osmose_marker_b_2120, R.string.osmose_error_description_2120),
        _2130(2130, R.drawable.osmose_marker_b_2130, R.string.osmose_error_description_2130),
        _2140(2140, R.drawable.osmose_marker_b_2140, R.string.osmose_error_description_2140),
        _2150(2150, R.drawable.osmose_marker_b_2150, R.string.osmose_error_description_2150),
        _2160(2160, R.drawable.osmose_marker_b_2160, R.string.osmose_error_description_2160),
        _3010(3010, R.drawable.osmose_marker_b_3010, R.string.osmose_error_description_3010),
        _3020(3020, R.drawable.osmose_marker_b_3020, R.string.osmose_error_description_3020),
        _3030(3030, R.drawable.osmose_marker_b_3030, R.string.osmose_error_description_3030),
        _3031(3031, R.drawable.osmose_marker_b_3031, R.string.osmose_error_description_3031),
        _3032(3032, R.drawable.osmose_marker_b_3032, R.string.osmose_error_description_3032),
        _3033(3033, R.drawable.osmose_marker_b_3033, R.string.osmose_error_description_3033),
        _3040(3040, R.drawable.osmose_marker_b_3040, R.string.osmose_error_description_3040),
        _3050(3050, R.drawable.osmose_marker_b_3050, R.string.osmose_error_description_3050),
        _3060(3060, R.drawable.osmose_marker_b_3060, R.string.osmose_error_description_3060),
        _3070(3070, R.drawable.osmose_marker_b_3070, R.string.osmose_error_description_3070),
        _3080(3080, R.drawable.osmose_marker_b_3080, R.string.osmose_error_description_3080),
        _3090(3090, R.drawable.osmose_marker_b_3090, R.string.osmose_error_description_3090),
        _3091(3091, R.drawable.osmose_marker_b_3091, R.string.osmose_error_description_3091),
        _3092(3092, R.drawable.osmose_marker_b_3092, R.string.osmose_error_description_3092),
        _3093(3093, R.drawable.osmose_marker_b_3093, R.string.osmose_error_description_3093),
        _3110(3110, R.drawable.osmose_marker_b_3110, R.string.osmose_error_description_3110),
        _3120(3120, R.drawable.osmose_marker_b_3120, R.string.osmose_error_description_3120),
        _3150(3150, R.drawable.osmose_marker_b_3150, R.string.osmose_error_description_3150),
        _3160(3160, R.drawable.osmose_marker_b_3160, R.string.osmose_error_description_3160),
        _3161(3161, R.drawable.osmose_marker_b_3161, R.string.osmose_error_description_3161),
        _3170(3170, R.drawable.osmose_marker_b_3170, R.string.osmose_error_description_3170),
        _3180(3180, R.drawable.osmose_marker_b_3180, R.string.osmose_error_description_3180),
        _3190(3190, R.drawable.osmose_marker_b_3190, R.string.osmose_error_description_3190),
        _3200(3200, R.drawable.osmose_marker_b_3200, R.string.osmose_error_description_3200),
        _3210(3210, R.drawable.osmose_marker_b_3210, R.string.osmose_error_description_3210),
        _3220(3220, R.drawable.osmose_marker_b_3220, R.string.osmose_error_description_3220),
        _3230(3230, R.drawable.osmose_marker_b_3230, R.string.osmose_error_description_3230),
        _3240(3240, R.drawable.osmose_marker_b_3240, R.string.osmose_error_description_3240),
        _3250(3250, R.drawable.osmose_marker_b_3250, R.string.osmose_error_description_3250),
        _3260(3260, R.drawable.osmose_marker_b_3260, R.string.osmose_error_description_3260),
        _4010(4010, R.drawable.osmose_marker_b_4010, R.string.osmose_error_description_4010),
        _4020(4020, R.drawable.osmose_marker_b_4020, R.string.osmose_error_description_4020),
        _4030(4030, R.drawable.osmose_marker_b_4030, R.string.osmose_error_description_4030),
        _4040(4040, R.drawable.osmose_marker_b_4040, R.string.osmose_error_description_4040),
        _4060(4060, R.drawable.osmose_marker_b_4060, R.string.osmose_error_description_4060),
        _4061(4061, R.drawable.osmose_marker_b_4061, R.string.osmose_error_description_4061),
        _4070(4070, R.drawable.osmose_marker_b_4070, R.string.osmose_error_description_4070),
        _4080(4080, R.drawable.osmose_marker_b_4080, R.string.osmose_error_description_4080),
        _4090(4090, R.drawable.osmose_marker_b_4090, R.string.osmose_error_description_4090),
        _4100(4100, R.drawable.osmose_marker_b_4100, R.string.osmose_error_description_4100),
        _4110(4110, R.drawable.osmose_marker_b_4110, R.string.osmose_error_description_4110),
        _4130(4130, R.drawable.osmose_marker_b_4130, R.string.osmose_error_description_4130),
        _5010(5010, R.drawable.osmose_marker_b_5010, R.string.osmose_error_description_5010),
        _5020(5020, R.drawable.osmose_marker_b_5020, R.string.osmose_error_description_5020),
        _5030(5030, R.drawable.osmose_marker_b_5030, R.string.osmose_error_description_5030),
        _5040(5040, R.drawable.osmose_marker_b_5040, R.string.osmose_error_description_5040),
        _5050(5050, R.drawable.osmose_marker_b_5050, R.string.osmose_error_description_5050),
        _5060(5060, R.drawable.osmose_marker_b_5060, R.string.osmose_error_description_5060),
        _5070(5070, R.drawable.osmose_marker_b_5070, R.string.osmose_error_description_5070),
        _5080(5080, R.drawable.osmose_marker_b_5080, R.string.osmose_error_description_5080),
        _6010(6010, R.drawable.osmose_marker_b_6010, R.string.osmose_error_description_6010),
        _6020(6020, R.drawable.osmose_marker_b_6020, R.string.osmose_error_description_6020),
        _6030(6030, R.drawable.osmose_marker_b_6030, R.string.osmose_error_description_6030),
        _6040(6040, R.drawable.osmose_marker_b_6040, R.string.osmose_error_description_6040),
        _6060(6060, R.drawable.osmose_marker_b_6060, R.string.osmose_error_description_6060),
        _6070(6070, R.drawable.osmose_marker_b_6070, R.string.osmose_error_description_6070),
        _7010(7010, R.drawable.osmose_marker_b_7010, R.string.osmose_error_description_7010),
        _7011(7011, R.drawable.osmose_marker_b_7011, R.string.osmose_error_description_7011),
        _7012(7012, R.drawable.osmose_marker_b_7012, R.string.osmose_error_description_7012),
        _7020(7020, R.drawable.osmose_marker_b_7020, R.string.osmose_error_description_7020),
        _7040(7040, R.drawable.osmose_marker_b_7040, R.string.osmose_error_description_7040),
        _7050(7050, R.drawable.osmose_marker_b_7050, R.string.osmose_error_description_7050),
        _7051(7051, R.drawable.osmose_marker_b_7051, R.string.osmose_error_description_7051),
        _7060(7060, R.drawable.osmose_marker_b_7060, R.string.osmose_error_description_7060),
        _7070(7070, R.drawable.osmose_marker_b_7070, R.string.osmose_error_description_7070),
        _7080(7080, R.drawable.osmose_marker_b_7080, R.string.osmose_error_description_7080),
        _7090(7090, R.drawable.osmose_marker_b_7090, R.string.osmose_error_description_7090),
        _7100(7100, R.drawable.osmose_marker_b_7100, R.string.osmose_error_description_7100),
        _7110(7110, R.drawable.osmose_marker_b_7110, R.string.osmose_error_description_7110),
        _7120(7120, R.drawable.osmose_marker_b_7120, R.string.osmose_error_description_7120),
        _7130(7130, R.drawable.osmose_marker_b_7130, R.string.osmose_error_description_7130),
        _7140(7140, R.drawable.osmose_marker_b_7140, R.string.osmose_error_description_7140),
        _7150(7150, R.drawable.osmose_marker_b_7150, R.string.osmose_error_description_7150),
        _7160(7160, R.drawable.osmose_marker_b_7160, R.string.osmose_error_description_7160),
        _7170(7170, R.drawable.osmose_marker_b_7170, R.string.osmose_error_description_7170),
        _7190(7190, R.drawable.osmose_marker_b_7190, R.string.osmose_error_description_7190),
        _7220(7220, R.drawable.osmose_marker_b_7220, R.string.osmose_error_description_7220),
        _7240(7240, R.drawable.osmose_marker_b_7240, R.string.osmose_error_description_7240),
        _7250(7250, R.drawable.osmose_marker_b_7250, R.string.osmose_error_description_7250),
        _8010(8010, R.drawable.osmose_marker_b_8010, R.string.osmose_error_description_8010),
        _8011(8011, R.drawable.osmose_marker_b_8011, R.string.osmose_error_description_8011),
        _8012(8012, R.drawable.osmose_marker_b_8012, R.string.osmose_error_description_8012),
        _8020(8020, R.drawable.osmose_marker_b_8020, R.string.osmose_error_description_8020),
        _8021(8021, R.drawable.osmose_marker_b_8021, R.string.osmose_error_description_8021),
        _8022(8022, R.drawable.osmose_marker_b_8022, R.string.osmose_error_description_8022),
        _8025(8025, R.drawable.osmose_marker_b_8025, R.string.osmose_error_description_8025),
        _8026(8026, R.drawable.osmose_marker_b_8026, R.string.osmose_error_description_8026),
        _8030(8030, R.drawable.osmose_marker_b_8030, R.string.osmose_error_description_8030),
        _8031(8031, R.drawable.osmose_marker_b_8031, R.string.osmose_error_description_8031),
        _8032(8032, R.drawable.osmose_marker_b_8032, R.string.osmose_error_description_8032),
        _8040(8040, R.drawable.osmose_marker_b_8040, R.string.osmose_error_description_8040),
        _8041(8041, R.drawable.osmose_marker_b_8041, R.string.osmose_error_description_8041),
        _8042(8042, R.drawable.osmose_marker_b_8042, R.string.osmose_error_description_8042),
        _8050(8050, R.drawable.osmose_marker_b_8050, R.string.osmose_error_description_8050),
        _8051(8051, R.drawable.osmose_marker_b_8051, R.string.osmose_error_description_8051),
        _8060(8060, R.drawable.osmose_marker_b_8060, R.string.osmose_error_description_8060),
        _8070(8070, R.drawable.osmose_marker_b_8070, R.string.osmose_error_description_8070),
        _8080(8080, R.drawable.osmose_marker_b_8080, R.string.osmose_error_description_8080),
        _8110(8110, R.drawable.osmose_marker_b_8110, R.string.osmose_error_description_8110),
        _8120(8120, R.drawable.osmose_marker_b_8120, R.string.osmose_error_description_8120),
        _8121(8121, R.drawable.osmose_marker_b_8121, R.string.osmose_error_description_8121),
        _8122(8122, R.drawable.osmose_marker_b_8122, R.string.osmose_error_description_8122),
        _8130(8130, R.drawable.osmose_marker_b_8130, R.string.osmose_error_description_8130),
        _8131(8131, R.drawable.osmose_marker_b_8131, R.string.osmose_error_description_8131),
        _8132(8132, R.drawable.osmose_marker_b_8132, R.string.osmose_error_description_8132),
        _8140(8140, R.drawable.osmose_marker_b_8140, R.string.osmose_error_description_8140),
        _8150(8150, R.drawable.osmose_marker_b_8150, R.string.osmose_error_description_8150),
        _8160(8160, R.drawable.osmose_marker_b_8160, R.string.osmose_error_description_8160),
        _8161(8161, R.drawable.osmose_marker_b_8161, R.string.osmose_error_description_8161),
        _8162(8162, R.drawable.osmose_marker_b_8162, R.string.osmose_error_description_8162),
        _8170(8170, R.drawable.osmose_marker_b_8170, R.string.osmose_error_description_8170),
        _8180(8180, R.drawable.osmose_marker_b_8180, R.string.osmose_error_description_8180),
        _8190(8190, R.drawable.osmose_marker_b_8190, R.string.osmose_error_description_8190),
        _8191(8191, R.drawable.osmose_marker_b_8191, R.string.osmose_error_description_8191),
        _8192(8192, R.drawable.osmose_marker_b_8192, R.string.osmose_error_description_8192),
        _8210(8210, R.drawable.osmose_marker_b_8210, R.string.osmose_error_description_8210),
        _8200(8200, R.drawable.osmose_marker_b_8200, R.string.osmose_error_description_8200),
        _8201(8201, R.drawable.osmose_marker_b_8201, R.string.osmose_error_description_8201),
        _8202(8202, R.drawable.osmose_marker_b_8202, R.string.osmose_error_description_8202),
        _8211(8211, R.drawable.osmose_marker_b_8211, R.string.osmose_error_description_8211),
        _8212(8212, R.drawable.osmose_marker_b_8212, R.string.osmose_error_description_8212),
        _8221(8221, R.drawable.osmose_marker_b_8221, R.string.osmose_error_description_8221),
        _8230(8230, R.drawable.osmose_marker_b_8230, R.string.osmose_error_description_8230),
        _8240(8240, R.drawable.osmose_marker_b_8240, R.string.osmose_error_description_8240),
        _8250(8250, R.drawable.osmose_marker_b_8250, R.string.osmose_error_description_8250),
        _8260(8260, R.drawable.osmose_marker_b_8260, R.string.osmose_error_description_8260),
        _8270(8270, R.drawable.osmose_marker_b_8270, R.string.osmose_error_description_8270),
        _8280(8280, R.drawable.osmose_marker_b_8280, R.string.osmose_error_description_8280),
        _8281(8281, R.drawable.osmose_marker_b_8281, R.string.osmose_error_description_8281),
        _8282(8282, R.drawable.osmose_marker_b_8282, R.string.osmose_error_description_8282),
        _8290(8290, R.drawable.osmose_marker_b_8290, R.string.osmose_error_description_8290),
        _8300(8300, R.drawable.osmose_marker_b_8300, R.string.osmose_error_description_8300),
        _8310(8310, R.drawable.osmose_marker_b_8310, R.string.osmose_error_description_8310),
        _8320(8320, R.drawable.osmose_marker_b_8320, R.string.osmose_error_description_8320),
        _8330(8330, R.drawable.osmose_marker_b_8330, R.string.osmose_error_description_8330),
        _8331(8331, R.drawable.osmose_marker_b_8331, R.string.osmose_error_description_8331),
        _8340(8340, R.drawable.osmose_marker_b_8340, R.string.osmose_error_description_8340),
        _8341(8341, R.drawable.osmose_marker_b_8341, R.string.osmose_error_description_8341),
        _8350(8350, R.drawable.osmose_marker_b_8350, R.string.osmose_error_description_8350),
        _8351(8351, R.drawable.osmose_marker_b_8351, R.string.osmose_error_description_8351),
        _8360(8360, R.drawable.osmose_marker_b_8360, R.string.osmose_error_description_8360),
        _8370(8370, R.drawable.osmose_marker_b_8370, R.string.osmose_error_description_8370),
        _8380(8380, R.drawable.osmose_marker_b_8380, R.string.osmose_error_description_8380),
        _8381(8381, R.drawable.osmose_marker_b_8381, R.string.osmose_error_description_8381),
        _8382(8382, R.drawable.osmose_marker_b_8382, R.string.osmose_error_description_8382),
        _8390(8390, R.drawable.osmose_marker_b_8390, R.string.osmose_error_description_8390),
        _8391(8391, R.drawable.osmose_marker_b_8391, R.string.osmose_error_description_8391),
        _8392(8392, R.drawable.osmose_marker_b_8392, R.string.osmose_error_description_8392),
        _8410(8410, R.drawable.osmose_marker_b_8410, R.string.osmose_error_description_8410),
        _8411(8411, R.drawable.osmose_marker_b_8411, R.string.osmose_error_description_8411),
        _8412(8412, R.drawable.osmose_marker_b_8412, R.string.osmose_error_description_8412),
        _9000(9000, R.drawable.osmose_marker_b_9000, R.string.osmose_error_description_9000),
        _9001(9001, R.drawable.osmose_marker_b_9001, R.string.osmose_error_description_9001),
        _9002(9002, R.drawable.osmose_marker_b_9002, R.string.osmose_error_description_9002),
        _9003(9003, R.drawable.osmose_marker_b_9003, R.string.osmose_error_description_9003),
        _9004(9004, R.drawable.osmose_marker_b_9004, R.string.osmose_error_description_9004),
        _9005(9005, R.drawable.osmose_marker_b_9005, R.string.osmose_error_description_9005),
        _9006(9006, R.drawable.osmose_marker_b_9006, R.string.osmose_error_description_9006),
        _9007(9007, R.drawable.osmose_marker_b_9007, R.string.osmose_error_description_9007),
        _9009(9009, R.drawable.osmose_marker_b_9009, R.string.osmose_error_description_9009),
        _9010(9010, R.drawable.osmose_marker_b_9010, R.string.osmose_error_description_9010),
        _9011(9011, R.drawable.osmose_marker_b_9011, R.string.osmose_error_description_9011),
        _9014(9014, R.drawable.osmose_marker_b_9014, R.string.osmose_error_description_9014),
        _9015(9015, R.drawable.osmose_marker_b_9015, R.string.osmose_error_description_9015),
        _9016(9016, R.drawable.osmose_marker_b_9016, R.string.osmose_error_description_9016),
        _9017(9017, R.drawable.osmose_marker_b_9017, R.string.osmose_error_description_9017),
        _9018(9018, R.drawable.osmose_marker_b_9018, R.string.osmose_error_description_9018),
        _9019(9019, R.drawable.osmose_marker_b_9019, R.string.osmose_error_description_9019),
        _9100(9100, R.drawable.osmose_marker_b_9100, R.string.osmose_error_description_9100),
    }

    companion object {
        fun GetTypeByItemNumber(item: Int): ERROR_TYPE? {
            return ERROR_TYPE.entries.find {
                item == it.Item
            }
        }
    }
}