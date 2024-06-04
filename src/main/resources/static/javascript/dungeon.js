document.addEventListener('DOMContentLoaded', (event) => {
    const roomDescription = document.getElementById('room-description');
    const userInput = document.getElementById('user-input');
    const submitButton = document.getElementById('submit-button');
    const healthProgress = document.getElementById('health-progress');

    // Initial health value
    let health = 100;

    // Function to fetch room description from the backend
    function fetchRoomDescription() {
        fetch('/game')  // Assuming your endpoint to get room description
            .then(response => response.json())
            .then(data => {
                roomDescription.innerHTML = data.description;
            })
            .catch(error => console.error('Error fetching room description:', error));
    }

    // Function to handle user move
    function handleUserMove() {
        const direction = userInput.value.toUpperCase();
        if (['N', 'E', 'S', 'W'].includes(direction)) {
            fetch('/move', {  // Assuming your endpoint to handle moves
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ direction: direction })
            })
            .then(response => response.json())
            .then(data => {
                roomDescription.innerHTML = data.description;
                // Update health if provided
                if (data.health !== undefined) {
                    health = data.health;
                    healthProgress.style.width = `${health}%`;
                }
            })
            .catch(error => console.error('Error handling move:', error));
        } else {
            alert('Invalid move! Please enter N, E, S, or W.');
        }
    }

    // Set up event listener for the submit button
    submitButton.addEventListener('click', handleUserMove);

    // Fetch initial room description
    fetchRoomDescription();
});
