function solution(s) {
  if (s.length !== 4 && s.length !== 6) {
    return false;
  }

  for (let value of Array.from(s)) {
    if (!Number.isInteger(+value)) {
      return false;
    }
  }

  return true;
}