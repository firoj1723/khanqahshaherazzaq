$(document).ready(function () {
    // Initialize the timestamp as 0 to get all existing notifications
    var lastTimestamp = 0;

    // Function to periodically check for new notifications
    function checkForNewNotifications() {
        $.get("/get-new-notifications", { timestamp: lastTimestamp }, function (data) {
            if (data.length > 0) {
                for (var i = 0; i < data.length; i++) {
                    // Display the notification using a popup library or your custom logic
                    alert(data[i].message);
                }
                // Update the lastTimestamp to the latest notification's timestamp
                lastTimestamp = data[data.length - 1].createdAt;
            }
        });
    }

    // Check for new notifications every 5 seconds
    setInterval(checkForNewNotifications, 5000);
});
