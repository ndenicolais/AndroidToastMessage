# ToastMessage
## Screen preview
<p float="left">
<img height="500em" src="ToastMessage0.png" title="ToastMessage's screen preview">
<img height="500em" src="ToastMessage1.png" title="ToastMessage's screen preview">
<img height="500em" src="ToastMessage2.png" title="ToastMessage's screen preview">
</p>

## Usage
Customize the layout of Toast
```
val toastLayout = layoutInflater.inflate(R.layout.toast_alert, findViewById(R.id.toast_alert_layout))
```
Customize the message to display
```
val toastText = toastLayout.findViewById<TextView>(R.id.toastText)
toastText.text = "Write yout text"
```
Creates the instance of Toast class.
```
val customToast = Toast(this)
```
Set the custom_toast layout to view.
```
customToast.view = toastLayout
```
Set the location at which the notification should appear on the screen.
```
customToast.setGravity(int gravity, int xOffset, int yOffset)
```
Set how long to show the view for.
```
customToast.duration(int duration)
```
Show the view for the specified duration.
```
customToast.show()
```
