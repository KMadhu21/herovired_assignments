const quiz = [
    {
      question: "1.Kiran Bedi received Magsaysay Award for government service in ?",
      choices: ["1992","1993", "1994", "1995"],
      answer: "1994"
    },
    {
      question: "2.Logarithm tables were invented by ?",
      choices: ["John Napier", "John Doe", "John Harrison", "John Douglas"],
      answer: "John Napier"
    },
    {
      question: "3. With which sport is the Jules Rimet trophy associated ?",
      choices: ["Basketball", "Football", "Hockey", "Golf"],
      answer: "Football"
    },
    {
      question: "4.Joule is the unit of ?",
      choices: ["temperature", "pressure", "energy", "heat"],
      answer: "energy"
    },
    {
      question: "5.What is the largest country by area ?",
      choices: ["Russia", "Canada", "China", "USA"],
      answer: "Russia"
    }
  ];
  
  const quizContainer = document.getElementById("quiz");
  const questionContainer = document.getElementById("questions");
  const choicesContainer = document.getElementById("choices");
  const submitButton = document.getElementById("submit");
  const resultContainer = document.getElementById("result");
  const reloadButton = document.getElementById("reload");
  
  let currentQuestion = 0;
  let score = 0;
  
  function showQuestion() {
    const question = quiz[currentQuestion].question;
    const choices = quiz[currentQuestion].choices;
    questionContainer.textContent = question;
    choicesContainer.innerHTML = "";
    for (let i = 0; i < choices.length; i++) {
      const choice = choices[i];
      const radio = document.createElement("input");
      radio.type = "radio";
      radio.name = "choice";
      radio.value = choice;
      choicesContainer.appendChild(radio);
      const label = document.createElement("label");
      label.textContent = choice;
      choicesContainer.appendChild(label);
    }
  }
  
  function submitAnswer() {
    const selected = document.querySelector('input[name="choice"]:checked');
    if (!selected) {
      alert("Please select an answer");
      return;
    }
    const answer = selected.value;
    if (answer === quiz[currentQuestion].answer) {
      score++;
    }
    currentQuestion++;
    if (currentQuestion === quiz.length) {
      showResult();
    } else {
      showQuestion();
    }
  }
  
  function showResult() {
    quizContainer.style.display = "none";
    resultContainer.style.display = "block";
    resultContainer.textContent = `Your score is ${score} out of ${quiz.length}`;
    
  }
  
  function reloadQuiz() {
    window.location.reload();
  }
  
  showQuestion();
  submitButton.addEventListener("click", submitAnswer);
  reloadButton.addEventListener("click", reloadQuiz);


  