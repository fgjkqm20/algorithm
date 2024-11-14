function compareChar(a, b) {
  const charA = a.toUpperCase();
  const charB = b.toUpperCase();

  if (charA > charB) {
    return -1;
  }
  if (charA < charB) {
    return 1;
  }

  return 0;
}

function isUpperCase(ch) {
  if (ch >= 'A' && ch <= 'Z') {
    return 1;
  } else {
    return 0;
  }
}

function compareCharCase(a, b) {
  return isUpperCase(a) - isUpperCase(b);
}

function solution(s) {
  let charArray = Array.from(s);

  charArray.sort(compareChar);
  charArray.sort(compareCharCase);

  return charArray.join('');
}
