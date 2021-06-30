# BootstrapIconsCompose
BootstrapIconsCompose is [Bootstrap icons](https://github.com/twbs/icons) pack for Jetpack Compose. This library is inspired by [compose-icons](https://github.com/DevSrSouza/compose-icons) and [FontAwesomeCompose](https://github.com/Gurupreet/FontAwesomeCompose). [svg-to-compose](https://github.com/DevSrSouza/svg-to-compose) is used to converts SVG to Compose code.

## Demo App
<img src="https://user-images.githubusercontent.com/26060382/123915179-6bbabd00-d9aa-11eb-9691-a46182700eb4.PNG" height="840">

#### Check the demo [here](https://github.com/wiryadev/BootstrapIconsCompose/blob/master/app/src/main/java/com/wiryadev/bootstrapiconscompose/MainActivity.kt)

## Usage
BsIcon composable is provided to make sure streamline size with Material Icons, default Icon composable is used underneath.
```
BsIcon(bsIcon = BootstrapIcons.Filled.Alarm)
```
To change the icon size, use `size` parameter
```
BsIcon(bsIcon = BootstrapIcons.Filled.Mic, size = 32.dp)
```
To use different color, use `tint` parameter
```
BsIcon(bsIcon = BootstrapIcons.Normal.Instagram, tint = MaterialTheme.colors.primary)
BsIcon(bsIcon = BootstrapIcons.Normal.Youtube, tint = Color.Red)
BsIcon(bsIcon = BootstrapIcons.Normal.Facebook, tint = Color(0xFF4267B2))
```
You can use it with default `Icon` composable, but the size will be defaulting to `16.dp` (according to original svg size), therefore not recommended to be used in combination with MaterialIcon that has `24.dp` size by default.
```
Icon(imageVector = BootstrapIcons.Normal.Alarm, contentDescription = "Alarm")
```

## License
For more info about Bootstrap icons license, check the official copyright [here](https://github.com/twbs/icons/blob/main/LICENSE.md).
