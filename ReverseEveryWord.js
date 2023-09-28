// Take a sentence as an input and reverse every word in that sentence.
function reverseWords(inputSentence) {
    var words = inputSentence.split(" ");

    var reversedWords = words.map(function(word) {
        return word.split("").reverse().join("");
    });

    var reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

var inputSentence = "This is a sunny day";
var reversed = reverseWords(inputSentence);
console.log(reversed); 
