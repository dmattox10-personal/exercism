var DnaTranscriber = function() {};

DnaTranscriber.prototype.toRna = function(input) {
var dna = input;
var rna = "";
for (var i = 0; i < dna.length; i++) {
    if (dna[i] == "C") {
      rna = rna + "G";
    }
    else if (dna[i] == "G") {
      rna = rna + "C";
    }
    else if (dna[i] == "A") {
      rna = rna + "U";
    }
    else if (dna[i] == "T") {
      rna = rna + "A";
    }
    else {
      throw new Error('Invalid input');
    }
  }
  return rna;
};

module.exports = DnaTranscriber;
