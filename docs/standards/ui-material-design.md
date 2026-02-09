# UI Baseline (Material Design Inspired, View UI Plus Compatible)

## 1. Design goals

- Clear information hierarchy
- Predictable interaction patterns
- Accessibility-aware defaults
- Visual consistency across desktop workflows

## 2. Color and elevation

- Keep one primary brand color and one semantic accent set.
- Use neutral surfaces for layout containers.
- Use elevation sparingly to separate layers:
  - level 0: page background
  - level 1: cards/panels
  - level 2: dialogs/dropdowns

## 3. Typography

- Use a clean sans-serif system stack.
- Recommended scale:
  - H1 32/40
  - H2 28/36
  - H3 24/32
  - Body 14/20
  - Caption 12/16

## 4. Spacing and layout

- Base spacing unit: `8px`.
- Card paddings: 16 or 24.
- Vertical rhythm: 16/24 spacing between sections.

## 5. Interaction and states

- Every clickable element must have clear hover/focus/active states.
- Keyboard navigation must remain functional.
- Error states should include:
  - concise message
  - likely cause
  - next action

## 6. Component guidance

- Buttons: one primary action per section.
- Forms: aligned labels, inline validation.
- Tables: sticky headers for long lists, action grouping.
- Dialogs: destructive actions require clear confirmation copy.
