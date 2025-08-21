function addTask() {
    let input = document.getElementById("taskInput");
    let taskText = input.value.trim();

    if (taskText === "") {
        alert("Please enter a task!");
        return;
    }

    let li = document.createElement("li");
    li.textContent = taskText;

    let removeBtn = document.createElement("button");
    removeBtn.textContent = "Remove";
    removeBtn.onclick = function () {
        li.remove();
    };

    li.appendChild(removeBtn);
    document.getElementById("taskList").appendChild(li);

    input.value = "";
}
