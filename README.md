Problem Statement
Design the Controller that handles multiple In-App notifications display

Abstract
To design and implement a controller class that controls or handles multiple notifications on a screen at a time. It acts as an intermediate component between UI and other classes that contain logic to handle these notifications. While dealing with multiple notifications, it is important to maintain the correct order and sequence of the notification in order to achieve consistency and prevent from the conflicting notifications. It controls which notification comes first on a screen and maintains the sequence of the flow of the notifications.
Instead of scattering notification handling code throughout the application, a controller class is dedicated to manage the appropriate actions based on the received notifications. This centralized approach simplifies code maintenance, debugging and testing.


Introduction

MainActivity Class
It initializes and interacts with this Controller instance to handle tooltips when the activity's window gains focus and when the activity is paused.

Controller Class
Manages a list of tooltip handlers and controls the display and dismissal of tooltips based on the order defined in the handlerList.

IHandler-Interface
This allows for a common interface to interact with different tooltip handlers, ensuring consistent behavior when showing or dismissing tooltips.

TooltipHandler Class
Responsible for managing a specific tooltip associated with a particular view. It interacts with the CustomTooltip class to show and dismiss the tooltip, and it communicates with the Controller class to notify when the tooltip is dismissed so that the controller can proceed to the next tooltip in the sequence.

CustomTooltip Class
Responsible for displaying and managing a custom tooltip.

Conclusion

Tooltip notification is shown one by one with delay of time.
Multiple notification is managed using controller class.

