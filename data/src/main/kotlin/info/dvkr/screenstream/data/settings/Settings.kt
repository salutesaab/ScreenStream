package info.dvkr.screenstream.data.settings

interface Settings : SettingsReadOnly {

    object Key {
        const val NIGHT_MODE = "PREF_KEY_NIGHT_MODE"
        const val MINIMIZE_ON_STREAM = "PREF_KEY_MINIMIZE_ON_STREAM"
        const val STOP_ON_SLEEP = "PREF_KEY_STOP_ON_SLEEP"
        const val START_ON_BOOT = "PREF_KEY_START_ON_BOOT"

        const val HTML_ENABLE_BUTTONS = "PREF_KEY_HTML_ENABLE_BUTTONS"
        const val HTML_BACK_COLOR = "PREF_KEY_HTML_BACK_COLOR"

        const val JPEG_QUALITY = "PREF_KEY_JPEG_QUALITY"
        const val RESIZE_FACTOR = "PREF_KEY_RESIZE_FACTOR"
        const val ROTATION = "PREF_KEY_ROTATION"

        const val ENABLE_PIN = "PREF_KEY_ENABLE_PIN"
        const val HIDE_PIN_ON_START = "PREF_KEY_HIDE_PIN_ON_START"
        const val NEW_PIN_ON_APP_START = "PREF_KEY_NEW_PIN_ON_APP_START"
        const val AUTO_CHANGE_PIN = "PREF_KEY_AUTO_CHANGE_PIN"
        const val PIN = "PREF_KEY_SET_PIN"

        const val USE_WIFI_ONLY = "PREF_KEY_USE_WIFI_ONLY"
        const val ENABLE_IPV6 = "PREF_KEY_ENABLE_IPV6"
        const val SERVER_PORT = "PREF_KEY_SERVER_PORT"
        const val LOGGING_ON = "PREF_KEY_LOGGING_ON"
    }

    object Default {
        const val NIGHT_MODE = -1
        const val MINIMIZE_ON_STREAM = true
        const val STOP_ON_SLEEP = false
        const val START_ON_BOOT = false

        const val HTML_ENABLE_BUTTONS = true
        const val HTML_BACK_COLOR = -16777216 // "ff000000".toLong(radix = 16).toInt()

        const val JPEG_QUALITY = 80
        const val RESIZE_FACTOR = 50
        const val ROTATION = Values.ROTATION_0

        const val ENABLE_PIN = false
        const val HIDE_PIN_ON_START = true
        const val NEW_PIN_ON_APP_START = true
        const val AUTO_CHANGE_PIN = false
        const val PIN = "0000"

        const val USE_WIFI_ONLY = true
        const val ENABLE_IPV6 = false
        const val SERVER_PORT = 8080
        const val LOGGING_ON = false
    }

    object Values {
        const val RESIZE_DISABLED = 100

        const val ROTATION_0 = 0
        const val ROTATION_90 = 90
        const val ROTATION_180 = 180
        const val ROTATION_270 = 270
    }

    override var nightMode: Int
    override var minimizeOnStream: Boolean
    override var stopOnSleep: Boolean
    override var startOnBoot: Boolean

    override var htmlEnableButtons: Boolean
    override var htmlBackColor: Int

    override var jpegQuality: Int
    override var resizeFactor: Int
    override var rotation: Int

    override var enablePin: Boolean
    override var hidePinOnStart: Boolean
    override var newPinOnAppStart: Boolean
    override var autoChangePin: Boolean
    override var pin: String

    override var useWiFiOnly: Boolean
    override var enableIPv6: Boolean
    override var severPort: Int
    override var loggingOn: Boolean
}