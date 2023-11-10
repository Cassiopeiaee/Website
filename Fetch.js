function loadData() {
    fetch('/api/blog/entries')
        .then(response => response.text())
        .then(data => {
            document.getElementById('output').innerText = 'API-Antwort: ' + data;
        })
        .catch(error => console.error('Error:', error));
}

window.onload = loadData;

