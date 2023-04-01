const apiUrl = 'https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page=1';
const url = 'https://api.themoviedb.org/3/search/movie?api_key=3fd2be6f0c70a2a598f084ddfb75487c&query=';
const cinema = document.getElementById('filmmaindiv');
const textsearch = document.getElementById('textinp');
const buttonsearch = document.getElementById('search');
Filmfun(apiUrl);
buttonsearch.addEventListener('click', function() {
  const keyword = textsearch.value;
  if (keyword !== '') {
    Filmfun(url + keyword);
  }
});
function Filmfun(url) {
  cinema.innerHTML = '';
  fetch(url)
    .then(response => response.json())
    .then(data => {
      const Films = data.results;
      Films.forEach(film => {
        const ele = document.createElement('div');
        ele.className = 'film';
        ele.dataset.movieId = film.id;
        ele.innerHTML = `
          <img src="https://image.tmdb.org/t/p/w500/${film.poster_path}" alt="${film.title}">
          <div class="rating">Rating : ${film.vote_average}</div>
          <div class="overview">${film.overview}</div>
        `;
        cinema.appendChild(ele);
       ele.addEventListener('click', function() {
          const movieId = this.dataset.movieId;
          fetch(`https://api.themoviedb.org/3/film/${movieId}?api_key=3fd2be6f0c70a2a598f084ddfb75487c`)
            .then(response => response.json())
            .then(data => {
              const modalElement = document.createElement('div');
              modalElement.className = 'modal';
              modalElement.innerHTML = `
                <div class="modal-content">
                  <span class="close">&times;</span>
                  <h2>${data.title}</h2>
                  <img src="https://image.tmdb.org/t/p/w500/${data.poster_path}" alt="${data.title}">
                  <p>${data.overview}</p>
                </div>
              `;
              document.body.appendChild(modalElement);
              const closeButton = modalElement.querySelector('.close');
              closeButton.addEventListener('click', function() {
                modalElement.remove();
              });
            })
            .catch(error => {
              console.log(error);
            });
        });
      });
    })
    .catch(error => {
      console.log(error);
    });
}